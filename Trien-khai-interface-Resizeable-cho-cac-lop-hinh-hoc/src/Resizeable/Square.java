package Resizeable;

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
    public void howToColor() {
        System.out.println("Color all four sides");
    }
     public double getArea() {
        return side * side;
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

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
//    public static void main(String[] args) {
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//    }
}
