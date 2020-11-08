package Method;

import Interface.Flyable;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    private static Flyable extractFlyable(String flyable){
        StringTokenizer st = new StringTokenizer(flyable, " ");

        String type = st.nextToken();
        String name = st.nextToken();
        int longitude = Integer.parseInt(st.nextToken());
        int latitude = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        return AircraftFactory.newAircraft(type, name, longitude, latitude, height);

    }
    public static void main(String[] args) {
	// write your code here
        FileUtil.createNewFile();
        int numberOfWeatherChanges = 0;
        Collection<Flyable> aircrafts = new ArrayList<>();
        WeatherProvider weatherProvider = WeatherProvider.getProvider();
        Coordinate randomCooridnate;
        Tower weatherTower = new WeatherTower();
        try {
            if(args.length == 1) {
                File file = new File(args[0]);
                Scanner scanner = new Scanner(file);
                if(scanner.hasNextLine()){
                    numberOfWeatherChanges = scanner.nextInt();
                    scanner.nextLine();
                }
                while (scanner.hasNextLine()) {
                    aircrafts.add(extractFlyable(scanner.nextLine()));
                }
                for(Flyable aircraft: aircrafts) {
                    weatherTower.register(aircraft);
                }
                for(int i = 0;i < numberOfWeatherChanges;i++){
                    ((WeatherTower)weatherTower).changeWeather();//down casting
                }
            }
            else
                throw new RuntimeException("invalid amount of arguments");
        }catch (FileNotFoundException e){
           throw new RuntimeException("File not found");
        }
    }
}