package Method;
import Interface.Flyable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

//observer design pattern
public abstract class Tower{
    private Collection<Flyable> observers = new CopyOnWriteArrayList<>();//tread safe array list.

    public abstract void register(Flyable flyable);
    public final void unregister(Flyable flyable){
        observers.remove(flyable);
        String fullClassName = flyable.getClass().getName();
        String finaleName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        FileUtil.writeToFile( finaleName + " " + "#" + flyable.getName() + "(" + flyable.getId() + ")"+": Aircraft is unregistered ");
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