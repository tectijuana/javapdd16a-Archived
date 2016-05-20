package visitor;

interface CarElementVisitor {

  void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}

interface CarElement {
 
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
 }
