public class Cell {
    private int x, y;
    private boolean visited;
    private boolean[] walls;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.visited = false;
        this.walls = new boolean[4];
        for (int i = 0; i < 4; i++) {
            walls[i] = true;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public boolean[] getWalls() {
        return walls;
    }
    
    public void removeWall(int direction, Cell neighbor) {
        // Remove a wall by index (0=top, 1=right, 2=bottom, 3=left)

        walls[direction] = false;

        if (direction == 0) {
            neighbor.walls[2] = false;
        }
        else if (direction == 1) {
            neighbor.walls[3] = false;
        }
        else if (direction == 2) {
            neighbor.walls[0] = false;
        }
        else if (direction == 3) {
            neighbor.walls[1] = false;
        }
    }
}