# Sorting Algorithms in Java

## Overview

This project implements classic sorting algorithms in Java using a generic, object-oriented design. It features:

- A "Node" interface to represent sortable elements.
- An abstract sorting base class tracking comparisons and swaps.
- Concrete implementations of **Selection Sort** and **Quicksort**.
- Multiple pivot selection strategies for Quicksort:
  - Median of three (first, middle, last elements)
  - Random pivot
  - Middle element pivot
- Performance measurement by counting comparisons and swaps.
- A test program that benchmarks Quicksort using different pivot strategies on a large dataset of "Car" objects.

---

## Features

- Generic sorting algorithms supporting any type implementing the "Node" interface.
- Clean, modular design demonstrating strong Object-Oriented Programming principles.
- Ability to compare the efficiency of different pivot selection methods in Quicksort.
- Detailed performance statistics output (average comparisons and swaps) over 1000 runs.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/sorting-algorithms-java.git
   ```

2. Compile the code (assuming you have Java JDK installed):
   ```bash
   javac worksheet2/*.java
   ```

3. Run the test program:
   ```bash
   java worksheet2.TestProgram
   ```

4. Observe the average comparisons and swaps printed for each pivot strategy in Quicksort.

---

## Code Structure

- 'Node.java': Interface defining the key for comparison.
- 'Car.java': A sample class implementing `Node` with fields like brand, model, price, and year.
- 'AbstractSort.java': Abstract class providing common sorting utilities and tracking metrics.
- 'Selectionsort.java': Concrete class implementing selection sort.
- 'Quicksort.java': Concrete class implementing quicksort with multiple pivot selection strategies.
- 'TestProgram.java': Main driver class running benchmarks on Quicksort.

---

## Sample Output

```
Method 1 (Median Strategy 1):
Average Comparisons: 53369.89
Average Swaps: 2020.38
Method 2 (Median Strategy 2):
Average Comparisons: 53785.75
Average Swaps: 2860.93
Method 3 (Median Strategy 3):
Average Comparisons: 53728.54
Average Swaps: 2919.99```

---

## Future Improvements

- Add implementations for more sorting algorithms (e.g., Merge Sort, Heap Sort).
- Integrate JUnit tests to verify algorithm correctness.
- Visualize sorting process and performance metrics.
- Optimize Quicksort for nearly sorted or large datasets.

---

## Author

*Thilakraj Soundararajan*  


