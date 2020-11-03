package Method;

import Interface.Flyable;

public class Jetplane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Jetplane(String name, Coordinate coordinate){
        this.name = name;
        this.coordinate = coordinate;
    }
    @Override
    public void updateCondition(){

    }
    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
    }

}
