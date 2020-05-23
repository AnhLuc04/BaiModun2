package b1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder() {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotalArea() {
        return super.getArea() * this.height;
    }

        public String toString() {
            return getTotalArea() + "";
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.0);
        cylinder.setHeight(3);
        cylinder.setColor("red");
        System.out.println("Total is: " + cylinder.toString());
    }
}
