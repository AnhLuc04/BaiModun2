public class OptimizedPrimeFactorization implements  Runnable {
    @Override
    public void run() {
        String result = "";
        for (int i = 2; i<=Math.sqrt(100); i++) {
            int divisible = 0;
            for (int j = 2; j <= i; j++) {

                if ((i%j) == 0)
                    divisible += 1;
            }
            if (divisible == 1) result += i + "\t";
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
     OptimizedPrimeFactorization primeNumber= new OptimizedPrimeFactorization();
        Thread t1 = new Thread(primeNumber);
        t1.start();
    }
}

