package Method;

import Interface.Flyable;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinate coordinate){
        this.name = name;
        this.coordinate = coordinate;
    }
    @Override
    public void updateCondition(){

    }
    @Override
    public void registerTower(WeatherTower weatherTower){

    }

}
