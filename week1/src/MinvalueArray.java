import java.util.ArrayList;
import java.util.Scanner;

public class MinvalueArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value of array is " + min);
    }


    public static int minValue(int[] array) {
        return -1;
    }
}
//    public static void main(String[] args) {
//        ArrayList<Integer> arrListInteger = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.println("Nhập số phần tử của ArrayList: ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + ": ");
//            number = scanner.nextInt();
//            arrListInteger.add(number);
//        }
//        int max = arrListInteger.get(0);
//
//        for (int i = 1; i < arrListInteger.size(); i++) {
//            if (arrListInteger.get(i).compareTo(max) > 0) {
//                max = arrListInteger.get(i);
//            }
//        }
//        System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);
//    }
//}
