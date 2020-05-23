public class NumberGenerator {
    public void EvenNumber() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public void odd() {
        for (int j = 0; j < 10; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
