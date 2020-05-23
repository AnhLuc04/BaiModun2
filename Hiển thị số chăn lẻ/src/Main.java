public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator numberGenerator = new NumberGenerator();
        OddThread oddThread = new OddThread(numberGenerator);
        EvenThread evenThread = new EvenThread(numberGenerator);
        oddThread.start();
        oddThread.join();
        System.out.println("------------");
        evenThread.start();
    }

}
