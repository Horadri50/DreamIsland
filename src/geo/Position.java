package src.geo;

public class Position {
    private final int x;
    private final int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position on(int x, int y) {
        return new Position(x, y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Position pos = (Position)o;
            return this.x == pos.x && this.y == pos.y;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.x;
        result = 31 * result + this.y;
        return result;
    }

    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
}
