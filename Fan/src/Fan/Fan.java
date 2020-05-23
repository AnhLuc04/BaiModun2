package Fan;

public class Fan {
        private int speed = 1;
        private double radius = 5;
        private String color = "blue";
        boolean on = true;

        public Fan() {
        }

        public int speed(int spd) {
            return spd;
        }

        public void turnOn() {
            this.on = true;
        }

        public void turnOff() {
            this.on = false;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSpeed(int spd) {
            this.speed = spd;
        }

        public double getRadius() {
            return this.radius;
        }

        public String getColor() {
            return this.color;
        }

        public int getSpeed() {
            return this.speed;
        }
        public String toString(){
            if (this.on){
                return "speed : "+this.speed+", color : "+this.color+", radius" +this.radius+", fan is on";
            }else {
                return "color : "+this.color+", radius" +this.radius+", fan is off!!!";
            }
        }
        public static void main(String[] args) {
            final int slow = 1;
            final int medium = 2;
            final int fast = 3;
            Fan fan1 = new Fan();
            Fan fan2 = new Fan();
            fan1.setSpeed(fast);
            fan1.setColor("yellow");
            fan1.setRadius(10);
            fan1.turnOn();

            fan2.setSpeed(medium);
            fan2.setColor("blue");
            fan2.setRadius(5);
            fan2.turnOff();

            System.out.println("fan1: "+fan1.toString());
            System.out.println("fan2: "+fan2.toString());
        }
    }

