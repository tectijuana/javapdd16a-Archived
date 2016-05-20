/**
 2  * Implementation of prototype class
 3  */
 4 
class PrototypeImpl implements Prototype {
 5     private int x;
 6 
 7     /**
 8      * Constructor
 9      */
10     public PrototypeImpl(int x) {
11         setX(x);
12     }
13 
14     @Override
15     public void setX(int x) {
16         this.x = x;
17     }
18 
19     @Override
20     public void printX() {
21         System.out.println("Value: " + getX());
22     }
23 
24     @Override
25     public int getX() {
26         return x;
27     }
28 
29     @Override
30 
    public PrototypeImpl clone() throws CloneNotSupportedException {
31         return (PrototypeImpl) super.clone();
32     }
33 }
