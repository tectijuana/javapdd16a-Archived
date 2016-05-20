/**
  * Construct a CarBuilder called carBuilder and build a car.
  */
 public class Director {
   public static void main(String[] args) {
     CarBuilder carBuilder = new CarBuilder();
     carBuilder.setSeaters(2);
     carBuilder.setSportCar();
     carBuilder.setTripComputer();
     carBuilder.unsetGPS();
     Car car = carBuilder.getResult();
 
     System.out.println(car);
   }
}
