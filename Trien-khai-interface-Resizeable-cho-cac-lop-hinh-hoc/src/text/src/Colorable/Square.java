package Colorable;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
   @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    @Override
    public String toString() {
        return "Square:"
                + "side=" + side
                + getSide()
                + hashCode()
                + super.toString()
                + ", Area="
                + getArea();

    }
}