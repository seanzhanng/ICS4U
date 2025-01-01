import java.util.*;

public class MazeSolver {
    private Grid grid;
    private int endX;
    private int endY;

    public MazeSolver(Grid grid) {
        this.grid = grid;
        this.endX = grid.width-1;
        this.endY = grid.height-1;
    }

    public Stack<Cell> solveMaze(int startX, int startY) {
        Stack<Cell> solutionStack = new Stack<>();
        solver(solutionStack, startX, startY);
        return solutionStack;
    }

    private boolean solver(Stack<Cell> solutionStack, int x, int y) {

        Cell currentCell = grid.getCell(x, y);

        if (currentCell.getX() == endX && currentCell.getY() == endY) { // base case
            solutionStack.push(currentCell);
            return true;
        }

        currentCell.setTraversed(true);
        solutionStack.push(currentCell);

        ArrayList<Integer> directions = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

        for (int direction : directions) {
            
            Cell neighbor = getNeighbor(x, y, direction, currentCell); // initialize the target cell

            if (neighbor != null && !neighbor.isTraversed() && grid.isValidMove(neighbor.getX(), neighbor.getY())) { // check if it has been visited before or if it is out of bounds
                if (solver(solutionStack, neighbor.getX(), neighbor.getY())) {
                    return true; // If we found the solution, return true
                }
            }
        }
        // after all directions for the single cell have been tested (aka dead end reached), pop it from the stack
        solutionStack.pop();
        return false;
    }

    private Cell getNeighbor(int x, int y, int direction, Cell cell) {
        if (direction == 0) {
            if (grid.isValidMove(x, y-1) && cell.getWalls()[0] == false) {
                return grid.getCell(x, y-1);
            }
        }
        else if (direction == 1) {
            if (grid.isValidMove(x+1, y) && cell.getWalls()[1] == false) {
                return grid.getCell(x+1, y);
            }
        }
        else if (direction == 2) {
            if (grid.isValidMove(x, y+1) && cell.getWalls()[2] == false) {
                return grid.getCell(x, y+1);
            }
        }
        else if (direction == 3) {
            if (grid.isValidMove(x-1, y) && cell.getWalls()[3] == false) {
                return grid.getCell(x-1, y);
            }
        }
        return null;
    }
}
