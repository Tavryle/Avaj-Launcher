package Method;

import java.util.Random;
import java.util.UUID;

public abstract class Aircraft{
    protected long id;
    protected String name;
    protected Coordinate coordinate;
    private static long idCounter;

    public Aircraft(){}

    protected Aircraft(String name, Coordinate coordinates){
        this.name = name;
        this.coordinate = coordinates;
        Random random = new Random();
        this.id = random.nextInt(10);
        nextId();
    }
    private Long nextId(){
        return idCounter++;
    }
}