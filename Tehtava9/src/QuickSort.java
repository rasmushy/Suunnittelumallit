public class QuickSort implements SortingStrategy {

    private int[] array;
    public void sort(int[] arr) {
        array = arr;
        quickSort(0, arr.length - 1);
    }

    private void quickSort(int low, int high) {

        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the pivot element from the middle of the list
            int pivot = partition(array, low, high);
            // Recursively sort the left and right parts of the array
            quickSort(low, pivot - 1);
            quickSort(pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        // Put the elements smaller than pivot on the left and
        // greater than pivot on the right of pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Put pivot in the right place
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public String toString() {
        return "QuickSort";
    }

}
