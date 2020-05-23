public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    final private double radius = 5;
    private String color = "blue";

    public Fan() {
        this.speed = SLOW;
    }

    public void turnon() {
        on = true;
    }

    public void turnoff() {
        on = false;
    }

    public void speed() {

    }

    public void getSpeed(int newSpeed) {
        if ( on && newSpeed >= 1) {
            speed = MEDIUM;
        }else if (on && newSpeed>=2){
            speed = FAST;
        }
        }
    private void getSpeed() {
        if (on && speed >= 1) {
            speed = MEDIUM;
        } else if (on && speed >= 2) {
            speed = FAST;
        }
    }

    public void setDown(int downSpeed) {
        if (on && downSpeed >= 3) {
            speed = MEDIUM;
        } else if (on && downSpeed >= 2) {
            speed = SLOW;
        }
    }

    public void setColor() {
        return;
    }

    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnon();
        System.out.println();
        fan.speed();
        System.out.println(fan.toString());
        System.out.println();
        fan.setColor();
        fan.getSpeed();
        fan.setColor();
        fan.turnon();

    }


}