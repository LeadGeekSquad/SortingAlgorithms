# SortingAlgorithms

🎯 This is a dedicated repository for in-place sorting algorithms. 

# In-Place Sorting Algorithms

Welcome to the In-Place Sorting Algorithms repository! This repository contains implementations of various in-place sorting algorithms, such as Bubble Sort, Selection Sort, and Insertion Sort. Each algorithm is implemented in Java, with accompanying explanations to help you understand the underlying logic.

### What Are In-Place Sorting Algorithms?

In-place sorting algorithms are algorithms that sort data without needing extra space for a copy of the array or list. They modify the data directly within the original array. This makes them efficient in terms of space complexity, as they typically use O(1) additional space.

### Algorithms Included

1. ### Bubble Sort
Bubble Sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

Time Complexity: O(n²)
Space Complexity: O(1)
Bubble Sort Explanation and Code: SortingAlgorithm/BubbleSort.java

2. ### Selection Sort
Selection Sort is an algorithm that divides the list into a sorted and an unsorted region. It repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the end of the sorted region.

Time Complexity: O(n²)
Space Complexity: O(1)
Selection Sort Explanation and Code: SortingAlgorithm/SelectionSort.java

3. ### Insertion Sort
Insertion Sort builds the sorted array one item at a time by repeatedly picking an element and inserting it into its correct position among the previously sorted elements.

Time Complexity: O(n²)
Space Complexity: O(1)
Insertion Sort Explanation and Code: SortingAlgorithm/InsertionSort.java


## How to Use

1. Clone this repository:
https://github.com/LeadGeekSquad/SortingAlgorithms.git

2. Navigate to the project directory:
cd SortingAlgorithms/SortingAlgorithm

3. Run the sorting algorithm of your choice (assuming you have Java compiler installed):
javac SelectionSort.java
java SelectionSort


## Why Use This Repository?

- Educational Purpose: This repository provides simple implementations of sorting algorithms, helping users understand how they work under the hood.
- In-Place Sorting: These algorithms require no extra memory for copying the data, which is essential in memory-constrained environments.
- Beginner-Friendly: Explanations are provided along with the code to help beginners grasp the concepts easily.


## Contributions

### Feel free to contribute to this project by:

- Optimizing the existing code
- Adding other sorting algorithms (like QuickSort or MergeSort)
- Improving explanations and documentation

### To contribute:

1. Fork the repository.
2. Create a feature branch (git checkout -b feature/new-algorithm).
3. Commit your changes (git commit -am 'Add new algorithm'). If you have created a new file, you must still use git add before using git commit -am.
4. Push to the branch (git push origin feature/new-algorithm).
5. Create a new Pull Request.