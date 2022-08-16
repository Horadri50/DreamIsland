package src.livingUnit;

import src.Food;
import src.geo.Position;
import java.util.List;
import java.util.Map;

public abstract class Animal {
    protected int weight;
    protected int speed;
    protected final double health = 100;
    private boolean alive = true;
    private Position position;
    private Map<Class<? extends Food>, Integer> canEat;

    public Animal(Position position) {
        this.position = position;
    }

    public boolean isAlive() {
        return alive;
    }

    public Map<Class<? extends Food>, Integer> getCanEat() {
        return canEat;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void doStep(int speed) {

    }

    abstract public Animal doBirth();

    abstract public void doEat();


}
