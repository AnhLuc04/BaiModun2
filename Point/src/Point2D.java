public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
    public static void main(String[] args){
        Point2D point2D = new Point2D(0,3);
        point2D.setX(0);
        point2D.setY(3);
        System.out.println("Point2D : " + point2D.toString());

        point2D.setXY(0, 4);
        System.out.println("Point2D : " + point2D.toString());

    }
}
