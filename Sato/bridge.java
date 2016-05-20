class BridgePattern {
 5    public static void main(String[] args) {
 6        Shape[] shapes = new Shape[] {
 7            new CircleShape(1, 2, 3, new DrawingAPI1()),
 8            new CircleShape(5, 7, 11, new DrawingAPI2()),
 9        };
10 
11        for (Shape shape : shapes) {
12            shape.resizeByPercentage(2.5);
13            shape.draw();
14        }
15    }
16 }
