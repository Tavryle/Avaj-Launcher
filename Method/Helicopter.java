package Method;

import Interface.Flyable;

public class Helicopter extends Aircraft{
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
                FileUtil.writeToFile("Helicopter " + "#" + name +" "+ id + ":SNOW The blade are breaking!");
            }
            break;
            case "SUN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 10,coordinate.getLatitude(),validateHeight(coordinate.getHeight() + 2));
                FileUtil.writeToFile("Helicopter " + "#" + name +" " + id + ":SUN The blade are breaking!");
            }
            break;
            case "RAIN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 5,coordinate.getLatitude(),validateHeight(coordinate.getHeight()));
                FileUtil.writeToFile("Helicopter " + "#" + name + " "+ id + ":RAIN The blade are breaking!");
            }
            case "FOG":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 1,coordinate.getLatitude(),validateHeight(coordinate.getHeight()));
                FileUtil.writeToFile("Helicopter " + "#" + name + " " + id + ":FOG The blade are breaking!");
            }
            break;
            default:
                throw new RuntimeException("Cannot find weather condition.");
        }
    }
    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;

    }
    private int validateHeight(int height){
        if(height <= 0){
            weatherTower.unregister(this);
            FileUtil.writeToFile("Helicopter " + name + " Landing ");
            return 0;
        }
        else if(height > 100){
            return 100;
        }
        return  height;
    }

}
