public class Grid {
    private Cell[][] grid;
    public int width, length;

    public Grid(int width, int height) {
        grid = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y] = new Cell(x, y);
            }
        }
        System.out.println("Grid created with width: " + width + " and height: " + height);
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length; // return true as long as in bounds
    }
}