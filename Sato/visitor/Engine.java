class Engine implements CarElement {
     /**
      * Accept the visitor.
      * This method will call the method visit(Engine)
      * and not visit(Wheel) nor visit(Body)
      * because <code>this</code> is declared as Engine.
      * That's why we need to define this code in each car element class.
      */
 
public void accept(CarElementVisitor visitor) {
  visitor.visit(this);
     }
 }
