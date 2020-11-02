package Method;
import Interface.Flyable;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Tower{
    private Collection observers = new ArrayList<Flyable>();

    public abstract void register(Flyable flyable);
    public abstract void unregister(Flyable flyable);
    protected abstract void conditionsChanged();
}