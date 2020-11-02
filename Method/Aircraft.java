package Method;

public class Aircraft{
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected long Aircraft(String name, Coordinate coordinates){
        this.name = name;
        this.coordinates = coordinates;

    }
    private long nextId(){
        //get the next id
    }
}