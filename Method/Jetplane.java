package Method;

import Interface.Flyable;

public class Jetplane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    Jetplane(String name, Coordinate coordinate){
        super(name, coordinate);
    }
    @Override
    public void updateCondition(){
        String currentWeather = weatherTower.getWeather(coordinate);
        Coordinate newCoordinate;
        switch (currentWeather){
            case "SNOW":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude(),validateHeight(coordinate.getHeight() - 7));
            }
            break;
            case "SUN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 10,validateHeight(coordinate.getHeight() + 2));
            }
            break;
            case "RAIN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 5,validateHeight(coordinate.getHeight()));
            }
            case "FOG":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 1,validateHeight(coordinate.getHeight()));
            }
            break;
            default:
                throw new RuntimeException("Cannot find weather condition.");
        }
        System.out.println(this.getClass().getName() + "#" + name + id + ": Can you feel the turbulence");
    }
    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
    }
    private int validateHeight(int height){
        if(height <= 0){
            weatherTower.unregister(this);
            System.out.println(name + " Landing " +coordinate.toString());
            return 0;
        }
        else if(height > 100){
            return 100;
        }
        return  height;
    }


}
