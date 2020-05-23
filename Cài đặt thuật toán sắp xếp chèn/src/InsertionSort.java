public class InsertionSort {
    public static int[] insertionSort(int[] list) {
        int i, k, y;

        for (k = 1; k < list.length; k++) {
            y = list[k];

            for (i = k - 1; i >= 0 && y < list[i]; i--) {
                list[i + 1] = list[i];
            }
            list[i + 1] = y;
        }

        return list;
    }
}
