package Method;

import Interface.Flyable;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name,int longitude,int latitude,int height){
        Flyable flyable;
        Coordinate newCoordnate = new Coordinate(longitude, latitude, height);

        switch(type.toLowerCase()){
            case "helicopter":
            {
                flyable = new Helicopter(name ,newCoordnate);//down casting - assigning a child class to a parent
            }
            break;
            case "jetplane" :
            {
                flyable = new Jetplane(name ,newCoordnate);//down casting
            }
            break;
            case "baloon":
            {
                flyable = new Baloon(name ,newCoordnate);//down casting
            }
            break;
            default:
                throw new RuntimeException("error " + type + " is not a valid flyable");
        }
        return flyable;

    }
}
