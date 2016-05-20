public class CarBuilder {
   /**  * Sport car.    */
   private static final int SPORT_CAR = 1;
 
 /**
  * City car.
    */
   private static final int CITY_CAR = 2;
 
   /**
  * Cabriolet.
    */
   private static final int CABRIOLET = 3;
 
   /**
    * The type of the car.
    */
   private int carType;
  
    /**
     * True if the car has a trip computer.
     */
    private boolean hasTripComputer;
  
    /**
     * True if the car has a GPS.
     */
    private boolean hasGPS;
  
    /**
     * The number of seaters the car may have.
     */
    private int seaterNumber;
  
    /**
     * Construct and return the car.
     * @return a Car with the right options.
     */
  
 public Car getResult() {
      return new Car((carType == CITY_CAR) ? "A city car" : ((carType == SPORT_CAR) ? "A sport car" : "A cabriolet")
          + " with " + seaterNumber + " seaters"
          + (hasTripComputer ? " with a trip computer" : "")
          + (hasGPS ? " with a GPS" : "")
          + ".");
      }
  
    /**
     * Tell the builder the number of seaters.
     * @param number the number of seaters the car may have.
     */
  
    public void setSeaters(int number) {
      seaterNumber = number;
    }

  /**
   * Make the builder remember that the car is a city car.
   */
  public void setCityCar() {
      carType = CITY_CAR;
    }

  /**
   * Make the builder remember that the car is a cabriolet.
   */
  public void setCabriolet() {
      carType = CABRIOLET;
    }

  /**
   * Make the builder remember that the car is a sport car.
   */
  public void setSportCar() {
      carType = SPORT_CAR;
    }

  /**
   * Make the builder remember that the car has a trip computer.
   */
  public void setTripComputer() {
      hasTripComputer = true;
    }

 /**
   * Make the builder remember that the car has not a trip computer.
   */
  public void unsetTripComputer() {
      hasTripComputer = false;
    }

  /**
   * Make the builder remember that the car has a global positioning system.
   */
  public void setGPS() {
      hasGPS = true;
     }
 
   /**
    * Make the builder remember that the car has not a global positioning system.
    */
   public void unsetGPS() {
       hasGPS = false;
     }
 }
