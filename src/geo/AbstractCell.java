package src.geo;

public abstract class AbstractCell {
    private final Position position;

    public AbstractCell(Position position) {
        this.position = position;
    }

    public int getX() {
        return this.position.getX();
    }

    public int getY() {
        return this.position.getY();
    }

    public Position getPosition() {
        return this.position;
    }

    public String toString() {
        return "AbstractCell{on " + this.position + '}';
    }
}
