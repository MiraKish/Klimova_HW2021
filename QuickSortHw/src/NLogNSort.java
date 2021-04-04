import java.util.Arrays;
import java.util.Collections;

public class NLogNSort {
    private int[] numbers;
    private int number;

    private void quicksort(int low, int high) {
        int i = low, j = high;

        int pivot = numbers[low + (high-low)/2];

        // Dividing
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            //
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
