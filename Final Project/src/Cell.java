public class Cell {
    private int x, y;
    private boolean visited;
    private boolean traversed;
    private boolean[] walls;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.visited = false;
        this.traversed = false;
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

    public boolean isVisited() { // for the maze generator
        return visited;
    }

    public void setVisited(boolean visited) { // for the maze generator
        this.visited = visited;
    }

    // note to self: there might be a way to just set every cell to not visited when maze solver is called
    public boolean isTraversed() { // for the maze solver
        return traversed;
    }

    public void setTraversed(boolean traversed) { // for the maze solver
        this.traversed = traversed;
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