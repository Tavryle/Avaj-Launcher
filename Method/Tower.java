package Method;
import Interface.Flyable;

import java.util.ArrayList;
import java.util.Collection;
//observer design pattern
public abstract class Tower{
    private Collection<Flyable> observers = new ArrayList<>();

    public abstract void register(Flyable flyable);
    public final void unregister(Flyable flyable){
        observers.remove(flyable);
    }
    protected void conditionsChanged(){
        for(Flyable f:observers )
        {
          f.updateCondition();
        }
    }
    protected Collection<Flyable> getObservers(){
        return observers;
    }

}