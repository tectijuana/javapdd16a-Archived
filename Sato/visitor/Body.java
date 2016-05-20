class Body implements CarElement {
     /**
      * Accept the visitor.
      * This method will call the method visit(Body)
      * and not visit(Wheel) nor visit(Engine)
      * because <code>this</code> is declared as Body.
      * That's why we need to define this code in each car element class.
  */
     public void accept(CarElementVisitor visitor) {
         visitor.visit(this);
     }
 }
