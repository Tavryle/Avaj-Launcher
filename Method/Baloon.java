package Method;

import Interface.Flyable;

public class Baloon extends Aircraft implements  Flyable{
    private WeatherTower weatherTower;

    Baloon(String name, Coordinate coordinate){
        super(name, coordinate);
    }
    @Override
    public void updateCondition(){
        String currentWeather = weatherTower.getWeather(coordinate);
        Coordinate newCoordinate;
        switch (currentWeather){
            case "SNOW":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude(),validateHeight(coordinate.getHeight() - 15));
                FileUtil.writeToFile("Baloon " + "#" + name + id + ":SNOW Pop!!!!!!!");

            }
            break;
            case "SUN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude() + 2,coordinate.getLatitude(),validateHeight(coordinate.getHeight() + 4));
                FileUtil.writeToFile("Baloon " + "#" + name + id + ":SUN Pop!!!!!!!");

            }
            break;
            case "RAIN":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude() ,validateHeight(coordinate.getHeight() - 5));
                FileUtil.writeToFile("Baloon " + "#" + name + id + ":RAIN Pop!!!!!!!");

            }
            case "FOG":
            {
                newCoordinate = new Coordinate(coordinate.getLongitude(),coordinate.getLatitude(),validateHeight(coordinate.getHeight() - 3));
                FileUtil.writeToFile("Baloon " + "#" + name + id + ":FOG Pop!!!!!!!");

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
            FileUtil.writeToFile( "Baloon " + name + " Landing ");
            return 0;
        }
        else if(height > 100){
            return 100;
        }
        return  height;
    }

}
