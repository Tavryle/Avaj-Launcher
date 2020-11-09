package Interface;

import Method.WeatherTower;

public interface Flyable{
    void updateCondition();
    void registerTower(WeatherTower WeatherTower);
    long getId();
    String getName();
}