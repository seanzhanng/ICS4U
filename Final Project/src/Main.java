import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int width = 3;
        int height = 3;

        Grid grid = new Grid(width, height);

        MazeGenerator mazeGenerator = new MazeGenerator(grid);
        MazeSolver mazeSolver = new MazeSolver(grid);

        mazeGenerator.generateMaze(0, 0);
        Stack<Cell> solutionStack = mazeSolver.solveMaze(0, 0); // Store the result stack

        // Iterate through the solution stack and print each cell
        System.out.println("Solution Path:");
        while (!solutionStack.isEmpty()) {
            Cell cell = solutionStack.pop(); // Pop cells from the stack
            System.out.println("Cell: (" + cell.getX() + ", " + cell.getY() + ")");
        }
    }
}
