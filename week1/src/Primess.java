import java.util.Arrays;
import java.util.Scanner;

public class Primess {
    public static void main(String[] args) {
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        while (input != 0) {
            System.out.println("Enter a number :");
            input = scanner.nextInt();
            hienThiGioiHanSoNguyenTO(input);
        }
    }

    public static boolean isSoNguyenTo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void hienThiGioiHanSoNguyenTO(int limit) {
        int count = 0;
        int[] array = new int[limit];
        for (int i = 2; i < Integer.MAX_VALUE && count < limit; i++) {
            if (isSoNguyenTo(i)) {
                array[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
