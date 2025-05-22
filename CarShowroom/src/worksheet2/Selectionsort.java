package worksheet2;

import java.util.List;

public class Selectionsort<T extends Node> extends AbstractSort<T> {

    @Override
    protected void sortAlgorithm(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (list.get(j).getKey() < list.get(minIndex).getKey()) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }
}
