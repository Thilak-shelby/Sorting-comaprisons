package worksheet2;

import java.util.List;
import java.util.Random;

public class Quicksort<T extends Node> extends AbstractSort<T> {
    private Random random = new Random();

    // Overloaded start method with median strategy selection
    public void start(List<T> list, int medianMethod) {
        // Reset counters directly
        comparisons = 0;
        swaps = 0;
        quicksort(list, 0, list.size() - 1, medianMethod);
    }

    @Override
    protected void sortAlgorithm(List<T> list) {
        // Default median strategy is 1 (median of three)
        quicksort(list, 0, list.size() - 1, 1);
    }

    // Quicksort algorithm with median method selection
    private void quicksort(List<T> list, int low, int high, int medianMethod) {
        if (low < high) {
            int pivotIndex = partition(list, low, high, medianMethod);
            quicksort(list, low, pivotIndex - 1, medianMethod);
            quicksort(list, pivotIndex + 1, high, medianMethod);
        }
    }

    // Partition method with median selection strategy
    private int partition(List<T> list, int low, int high, int medianMethod) {
        int pivotIndex = getMedianIndex(list, low, high, medianMethod);
        T pivot = list.get(pivotIndex);
        swap(list, pivotIndex, high); // Move pivot to the end

        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisons++;
            if (list.get(j).getKey() <= pivot.getKey()) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    // Method to get the median index based on the selected strategy
    private int getMedianIndex(List<T> list, int low, int high, int method) {
        switch (method) {
            case 1:
                return medianOfThree(list, low, high);
            case 2:
                return random.nextInt(high - low + 1) + low; // Random pivot
            case 3:
                return low + (high - low) / 2; // Middle element
            default:
                return low; // Default to the first element if invalid method
        }
    }

    // Method 1: Median of Three (first, middle, last)
    private int medianOfThree(List<T> list, int low, int high) {
        int mid = low + (high - low) / 2;
        int lowKey = list.get(low).getKey();
        int midKey = list.get(mid).getKey();
        int highKey = list.get(high).getKey();

        // Determine the median of the three values
        if ((lowKey < midKey && midKey < highKey) || (highKey < midKey && midKey < lowKey)) {
            return mid;
        } else if ((midKey < lowKey && lowKey < highKey) || (highKey < lowKey && lowKey < midKey)) {
            return low;
        } else {
            return high;
        }
    }
}
