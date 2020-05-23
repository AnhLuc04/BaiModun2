public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        System.out.println(printPrimeNumber(n));
    }
    public static String printPrimeNumber(int n) {
        String result = "";
        for (int i = 2; i<=n; i++) {
            int divisible = 0;
            for (int j = 2; j <= i; j++) {
                if ((i%j) == 0)
                    divisible += 1;
            }
            if (divisible == 1) result += i + "\t";
        }
        return result;
    }
}
