package Method;

import Interface.Flyable;

import java.util.Random;
import java.util.UUID;

public abstract class Aircraft implements Flyable {
    protected long id;
    protected String name;
    protected Coordinate coordinate;
    private static long idCounter = 0;

    public Aircraft(){}

    protected Aircraft(String name, Coordinate coordinates){
        this.name = name;
        this.coordinate = coordinates;
        this.id = nextId();
    }
    private Long nextId(){
        return idCounter++;
    }
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}