public class BubbleSort implements SortingStrategy {
    public void sort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        boolean swapped; // flag to check if swapping has occurred
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            /* Last i elements are already in place,
             * so we don't need to check them again
             */
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public String toString() {
        return "BubbleSort";
    }
}
