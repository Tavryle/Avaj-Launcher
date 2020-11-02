package Method;
import java.utile.ArrayList;

public class Tower{
    ArrayList<String> observers = new ArrayList<String>();

    public void register(flyable Flyable);
    public void unregister(flyable Flyable);
    protected void conditionsChanged();
}