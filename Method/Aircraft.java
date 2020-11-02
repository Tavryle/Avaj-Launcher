package Method;

import java.util.Random;
import java.util.UUID;

public class Aircraft{
    protected long id;
    protected String name;
    protected Coordinate coordinate;
    private static long idCounter;

    public Aircraft(){}

    protected Aircraft(String name, Coordinate coordinates){
        this.name = name;
        this.coordinate = coordinates;
        Random random = new Random();
        this.id = random.nextInt();
    }
    private Long nextId(){
        return null;
    }
}