import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.pow;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSize2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return pow(side3, 2) * 3 / 4;
    }

    public double getPerimeter() {
        return side1 * 1.0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",color=" + super.setColor() +
                ",filled=" + super.isFilled() +
//                "all="+super.toString()+
                ",Area=" + getArea() +
                ",Perimete =" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(1, 2, 3);
        System.out.println(triangle);

        triangle = new Triangle("red", false, 2, 3, 4);
        System.out.println(triangle);
    }
}

