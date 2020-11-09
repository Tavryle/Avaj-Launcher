package Method;

import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();//variable declaration and variable assignment
    private final static String[] WEATHER = {"SNOW","SUN","RAIN","FOG"};

    private WeatherProvider(){

    }
    public static WeatherProvider getProvider(){
        return weatherProvider;// variable has a value already that's why there's no need to set it.
    }
    public String getCurrentWeather(Coordinate coordinate) {
        Random random = new Random();
        if (coordinate.getHeight() > 0 && coordinate.getHeight() <= 24) {
            return WEATHER[random.nextInt(4)];
        } else if (coordinate.getHeight() > 24 && coordinate.getHeight() <= 49) {
            return WEATHER[random.nextInt(4)];
        } else if (coordinate.getHeight() > 49 && coordinate.getHeight() <= 74) {
            return WEATHER[random.nextInt(4)];
        } else{
            return WEATHER[random.nextInt(4)];
        }
    }
}
