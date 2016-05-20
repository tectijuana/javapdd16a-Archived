/**
  * Can have GPS, trip computer and a various number of seaters. Can be a city car, a sport car or a cabriolet.
  */
 
public class Car {
   /**
    * The description of the car.
    */
   private String description = null;
 
   /**
    * Construct and return the car.
    * @param aDescription The description of the car.
    */
   public Car(String aDescription) {
       description = aDescription;
     }
  
   /**
    * Print the car.
    * @return A flat representation.
    */
   public String toString() {
       return description;
     }
 }
