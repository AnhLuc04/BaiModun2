package Colorable;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                Colorable A = (Circle) shape;
                System.out.println(A.howToColor());
            } else if (shape instanceof Rectangle) {
                Colorable B = (Rectangle) shape;
                System.out.println(B.howToColor());
            } else if (shape instanceof Square) {
                Colorable C = (Square) shape;
                System.out.println(C.howToColor());
            }
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
