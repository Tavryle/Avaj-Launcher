package Method;

import Interface.Flyable;
import Method.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class WeatherTower extends Tower{
    public String getWeather(Coordinate coordinate){
        return WeatherProvider.getProvider().getCurrentWeather(coordinate);//return the result of a method
    }
     void  changeWeather(){
        conditionsChanged();
     }

    @Override
    public void register(Flyable flyable) {
        getObservers().add(flyable);
        flyable.registerTower(this);
    }
}