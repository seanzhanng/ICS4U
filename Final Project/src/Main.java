public class Main {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        Grid grid = new Grid(width, height);

        MazeGenerator mazeGenerator = new MazeGenerator(grid);

        mazeGenerator.generateMaze(0, 0);
    }
}