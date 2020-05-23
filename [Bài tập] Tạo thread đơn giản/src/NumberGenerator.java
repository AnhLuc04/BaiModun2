public class NumberGenerator extends Thread  {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i+""+this.hashCode());
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }

}
