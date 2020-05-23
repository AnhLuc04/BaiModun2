public class MinArray {
    static int arr[] = {1, 3, -9, 0, 8, 167, 23};
    public static void main(String[] args) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i])
//                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
//        System.out.println("Maximum value of array is " + max);
        System.out.println("Minimum value of array is " + min);
    }
}
