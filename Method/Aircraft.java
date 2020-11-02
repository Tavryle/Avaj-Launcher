package Method;

public class Aircraft{
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected long Aircraft(String name, Coordinate coordinates);
    private long nextId();
}