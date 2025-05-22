package worksheet2;

import java.util.List;

public abstract class AbstractSort<T extends Node> {
    protected int comparisons = 0;
    protected int swaps = 0;
    
  

    // Template method
    public final void start(List<T> list) {
        comparisons = 0;
        swaps = 0;
        sortAlgorithm(list);
    }

    // Abstract method to be implemented by subclasses
    protected abstract void sortAlgorithm(List<T> list);

    // Getter for comparisons count
    public int getComparisons() {
        return comparisons;
    }

    // Getter for swaps count
    public int getSwaps() {
        return swaps;
    }

    // Method to swap elements
    protected void swap(List<T> list, int i, int j) {
        if (i != j) {
            swaps++;
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
