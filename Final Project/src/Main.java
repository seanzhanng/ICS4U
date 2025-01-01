public class Main {
    public static void main(String[] args) {
        int width = 3;
        int height = 3;

        Grid grid = new Grid(width, height);

        MazeGenerator mazeGenerator = new MazeGenerator(grid);

        mazeGenerator.generateMaze(0, 0);
    }
}