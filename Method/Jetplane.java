package Method;

import Interface.Flyable;

public class Jetplane extends Aircraft{
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
                FileUtil.writeToFile("Jetplane " + "#" + name + " " + "(" + id + ")" + ":SNOW Can you feel the turbulence");

            }
            break;
            case "SUN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 10,validateHeight(coordinate.getHeight() + 2));
                FileUtil.writeToFile("Jetplane " + "#" + name + " " + "(" + id + ")" + ":SUN Can you feel the turbulence");

            }
            break;
            case "RAIN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 5,validateHeight(coordinate.getHeight()));
                FileUtil.writeToFile("Jetplane " + "#" + name + " " + "(" + id + ")" + ":RAIN Can you feel the turbulence");

            }
            case "FOG":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() + 1,validateHeight(coordinate.getHeight()));
                FileUtil.writeToFile("Jetplane " + "#" + name + " " + "(" + id + ")" + ":FOG Can you feel the turbulence");

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
            FileUtil.writeToFile("Jetplane " + name + " " + "(" + id + ")" + " Landing ");
            return 0;
        }
        else if(height > 100){
            return 100;
        }
        return  height;
    }


}
