package Method;


public class Coordinate {
     private int longitude;
     private int latitude;
     private int height;

    @Override
    public String toString() {
        return "Coordinate{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", height=" + height +
                '}';
    }

    Coordinate(int longitude, int latitude, int height){
         this.longitude = longitude;
         this.latitude = latitude;
         this.height = height;
     }
    public int getLongitude() {
        return longitude;
    }
    public int getLatitude() {
        return latitude;
    }
    public int getHeight() {
        return height;
    }
}