package Method;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();//variable declaration and variable assignment
    private final static String[] WEATHER = {"SNOW","SUN","RAIN","FOG"};

    private WeatherProvider(){

    }
    public static WeatherProvider getProvider(){
        return weatherProvider;// variable has a value already that's why there's no need to se tit.
    }
    public String getCurrentWeather(Coordinate coordinate) {
        if (coordinate.getHeight() > 0 && coordinate.getHeight() <= 24) {
            return WEATHER[1];
        } else if (coordinate.getHeight() > 24 && coordinate.getHeight() <= 49) {
            return WEATHER[3];
        } else if (coordinate.getHeight() > 49 && coordinate.getHeight() <= 74) {
            return WEATHER[2];
        } else{
            return WEATHER[0];
        }
    }
}
