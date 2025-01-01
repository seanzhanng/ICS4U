import java.util.*;

public class MazeGenerator {
    private Grid grid;
    private int cells;
    private int counter;
    private int endX;
    private int endY;

    public MazeGenerator(Grid grid) {
        this.grid = grid;
        this.cells = grid.width*grid.height; // total cells in the grid
        this.counter = 0; // 0 cells traversed
        this.endX = grid.width-1;
        this.endY = grid.height-1;
    }

    public void generateMaze(int startX, int startY) {
        Stack<Cell> stack = new Stack<>(); // create a stack to track visited cells order
        traverse(stack, startX, startY);
    }

    private void traverse(Stack<Cell> stack, int x, int y) { // the moving method that's going to be called recursively
        if (counter >= cells) { // if all cells have been visited, stop
            return;
        }

        Cell currentCell = grid.getCell(x, y);

        System.out.println("Visited the cell: (" + currentCell.getX() + ", " + currentCell.getY() + ")");

        if (currentCell.getX() == endX && currentCell.getY() == endY) {
            System.out.println("Reached the end!");
        }

        currentCell.setVisited(true); // mark the current cell as visited
        counter++; // increment visited cells by 1
        stack.push(currentCell); // push the current cell to the stack

        // pick a random neighboring cell
        ArrayList<Integer> directions = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        Collections.shuffle(directions); // randomize the array

        for (int direction : directions) {
            // initialize the target cell
            Cell neighbor = getNeighbor(x, y, direction);
            // check if it has been visited before
            // check if it is out of bounds
            if (neighbor != null && !neighbor.isVisited() && grid.isValidMove(neighbor.getX(), neighbor.getY())) {
                // break the wall
                currentCell.removeWall(direction, neighbor);
                // traverse new current cell
                traverse(stack, neighbor.getX(), neighbor.getY());
            }
        }
        // after all directions for the single cell have been tested (aka dead end reached), pop it from the stack
        stack.pop();
    }
    private Cell getNeighbor(int x, int y, int direction) {
        if (direction == 0) {
            if (grid.isValidMove(x-1, y)) {
                return grid.getCell(x-1, y);
            }
        }
        else if (direction == 1) {
            if (grid.isValidMove(x+1, y)) {
                return grid.getCell(x+1, y);
            }
        }
        else if (direction == 2) {
            if (grid.isValidMove(x, y-1)) {
                return grid.getCell(x, y-1);
            }
        }
        else if (direction == 3) {
            if (grid.isValidMove(x, y+1)) {
                return grid.getCell(x, y+1);
            }
        }
        return null;
    }
}