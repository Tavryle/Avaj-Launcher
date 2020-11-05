package Method;

import Interface.Flyable;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinate coordinate){
        super(name,coordinate);//super speaks to the superclass or parent class.
    }
    @Override
    public void updateCondition(){
        String currentWeather = weatherTower.getWeather(coordinate);
        Coordinate newCoordinate;
        switch (currentWeather){
            case "SNOW":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude(),validateHeight(coordinate.getHeight() - 12));
            }
            break;
            case "SUN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 10,coordinate.getLatitude(),validateHeight(coordinate.getHeight() + 2));
            }
            break;
            case "RAIN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 5,coordinate.getLatitude(),validateHeight(coordinate.getHeight()));
            }
            case "FOG":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 1,coordinate.getLatitude(),validateHeight(coordinate.getHeight()));
            }
            break;
            default:
                throw new RuntimeException("Cannot find weather condition.");
        }
        System.out.println(this.getClass().getName() + "#" + name + id + ": The blade are breaking!");
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
