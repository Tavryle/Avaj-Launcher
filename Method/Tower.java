package Method;
import Interface.Flyable;

import java.util.ArrayList;
import java.util.Collection;
//observer design pattern
public class Tower{
    private Collection<Flyable> observers = new ArrayList<>();

    public final void register(Flyable flyable){
        observers.add(flyable);
    }
    public final void unregister(Flyable flyable){
        observers.remove(flyable);
    }
    protected void conditionsChanged(){
        for(Flyable f:observers )
        {
          f.updateCondition();
        }
    }

}