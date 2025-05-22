package worksheet2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestProgram {
    public static void main(String[] args) {
        int[] totalComparisons = new int[3];
        int[] totalSwaps = new int[3];
        int runs = 1000;

        // Perform 1000 runs for each median strategy (1, 2, and 3)
        for (int method = 1; method <= 3; method++) {
            for (int run = 0; run < runs; run++) {
                // Initialize the list with 10 meaningful car entries
                List<Car> carList = new ArrayList<>();
                carList.add(new Car("Toyota", "Corolla", 20000, 2020));
                carList.add(new Car("BMW", "X5", 45000, 2019));
                carList.add(new Car("Honda", "Civic", 22000, 2021));
                carList.add(new Car("Mercedes", "C-Class", 35000, 2018));
                carList.add(new Car("Audi", "A4", 37000, 2020));
                carList.add(new Car("Ford", "Mustang", 30000, 2017));
                carList.add(new Car("Chevrolet", "Malibu", 18000, 2018));
                carList.add(new Car("Nissan", "Altima", 25000, 2021));
                carList.add(new Car("Hyundai", "Elantra", 19000, 2019));
                carList.add(new Car("Tesla", "Model 3", 50000, 2022));

                // Add 990 random car entries
                String[] brands = {"Toyota", "BMW", "Honda", "Mercedes", "Audi", "Ford", "Chevrolet", "Nissan", "Hyundai", "Tesla"};
                String[] models = {"Model A", "Model B", "Model C", "Model D", "Model E"};
                Random random = new Random();

                for (int i = 0; i < 990; i++) {
                    String brand = brands[random.nextInt(brands.length)];
                    String model = models[random.nextInt(models.length)];
                    int price = 15000 + random.nextInt(40000);
                    int year = 2015 + random.nextInt(10);

                    carList.add(new Car(brand, model, price, year));
                }

                // Create a copy of the list for sorting
                List<Car> quickSortList = new ArrayList<>(carList);

                Quicksort<Car> quicksort = new Quicksort<>();

                // Sort using Quicksort with the selected median strategy
                quicksort.start(quickSortList, method);
                totalComparisons[method - 1] += quicksort.getComparisons();
                totalSwaps[method - 1] += quicksort.getSwaps();
            }
        }

        // Calculate and print the average comparisons and swaps for each median strategy
        for (int method = 1; method <= 3; method++) {
            double avgComparisons = (double) totalComparisons[method - 1] / runs;
            double avgSwaps = (double) totalSwaps[method - 1] / runs;
            System.out.printf("Method %d (Median Strategy %d):%n", method, method);
            System.out.printf("Average Comparisons: %.2f%n", avgComparisons);
            System.out.printf("Average Swaps: %.2f%n", avgSwaps);
        }
    }
}
