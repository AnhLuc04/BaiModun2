package b1;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setXY(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getXY() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(0);
        point.setY(3);
        System.out.println("Point : " + point.toString());

        point.setXY(0, 4);
        System.out.println("Point : " + point.toString());

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(2);

        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}