package Method;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private final static String[] weather = {"SNOW","SUN","RAIN","FOG"};

    private WeatherProvider(){

    }
    public WeatherProvider getProvider(){
        return this.weatherProvider;// google singleton designed pattern 3 design pattern
    }
    public String getCurrentWeather(Coordinate coordinate){
        return null;
    }
}
