public class Square implements Shape {
    public int Hight=2;
    public int Wight=2;

    public void getHigth() {
        this.Hight = Hight;
    }

    public void getWight() {
        this.Wight = Wight;
    }

    public void setHight(int Hight) {
        Hight = Hight;
    }

    public void setWight(int wight) {
        Wight = wight;
    }

    @Override
    public void draw() {
        int result = Hight * Wight;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Hight=" + Hight +
                ", Wight=" + Wight +
                ",result=" + toString() +
                '}';
    }
}

