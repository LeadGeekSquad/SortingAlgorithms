package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {

    /**
     * INSERTION SORT - Segregate the array in sorted and unsorted parts and 
     * then while traversing compare and start moving the elements from unsorted part to sorted.
     * Here we are bringing the smaller element from unsorted to sorted part
     * Time complexity: O(n^2)  
     * Space complexity: O(1)
     */
    public static void main(String[] args) {

        int[] arr = {95,78,98,99,100,50};

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        for(int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;

        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
