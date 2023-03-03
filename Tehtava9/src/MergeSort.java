public class MergeSort implements SortingStrategy {
    private int[] tempMergeArr;
    private int[] array;

    public void sort(int[] inputArr) {
        this.array = inputArr;
        int length = inputArr.length;
        this.tempMergeArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        // check if low is smaller then high, if not then the array is sorted
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // sort the left side of the array
            doMergeSort(lowerIndex, middle);
            // sort right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        // Copy both parts into the temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        // Copy the smallest values from either the left or the right side back
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }

    public String toString() {
        return "MergeSort";
    }

}
