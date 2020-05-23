package b1;


import java.util.Random;
import java.util.Scanner;
class StopWatchTest{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int n = 100000;
        int[] arr = new int[n];
        Random rd = new Random();
        int i, j, min;
        System.out.println("tao day so: ");
        for(i = 0; i < n; i++) {
            arr[i] = rd.nextInt(1000);
        }

        StopSwatch.StopWatch countStopWatch = new StopSwatch.StopWatch();
        countStopWatch.start();
        for(i = 0; i < n - 1; i++) {
            for(j = i + 1; j < n; j++ ) {
                if(arr[i] > arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        countStopWatch.stop();

        System.out.println("time of selection sort: " +countStopWatch.getElapsedTime() +"ms");

        /*
         * for(i = 0; i < n; i++) { System.out.print(arr[i] + "\t"); }
         */

    }
}

