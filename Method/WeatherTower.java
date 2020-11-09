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
        String fullClassName = flyable.getClass().getName();
        String finaleName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        FileUtil.writeToFile( finaleName + " " +flyable.getId() +": Aircraft is registered ");
        //FileUtil.writeToFile(flyable.getClass().getName() + ": Aircraft is registered");
    }
}