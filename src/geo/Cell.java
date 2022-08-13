package src.geo;

import src.livingUnit.Grass;

public class Cell extends AbstractCell {
    private final Grass grass;

    public Cell(Position position, Grass grass) {
        super(position);
        this.grass = grass;
    }

    public Grass getGrass() {
        return this.grass;
    }


    public void update() {
        //this.grass.update();
    }

    public String toString() {
        return "Cell{position=" + this.getPosition() + ", grass=" + this.grass + '}';
    }

}
