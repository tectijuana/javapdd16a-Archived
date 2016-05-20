class Car implements CarElement {
     CarElement[] elements;
 
     public Car() {
         // Create new Array of elements
         this.elements = new CarElement[] { new Wheel("front left"),
             new Wheel("front right"), new Wheel("back left") ,
             new Wheel("back right"), new Body(), new Engine() };
     }
 
 
    public void accept(CarElementVisitor visitor) {    
         for(CarElement element : elements) {
 
    element.accept(visitor);
         }
 
    visitor.visit(this);    
     }
 }
