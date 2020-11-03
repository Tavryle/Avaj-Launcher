package Method;

import Interface.Flyable;

public class AircraftFactory {
    public Flyable newAircraft(String type, String name,int longitude,int latitude,int height){
        Flyable flyable;
        Coordinate newCoordnate = new Coordinate(longitude, latitude, height);
        switch(type){
            case "Helicopter":
            {
                flyable = new Helicopter(name ,newCoordnate);//down casting - assigning a child class to a parent
            }
            break;
            case "Jetplane" :
            {
                flyable = new Jetplane(name ,newCoordnate);//down casting
            }
            break;
            case "Baloon":
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
