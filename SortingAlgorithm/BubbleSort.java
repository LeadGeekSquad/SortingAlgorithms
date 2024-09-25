package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

    /**
     * BUBBLE SORT -> Bringing the greatest number in the array to the last position.
     * Time complexity: O(n^2)  
     * Space complexity: O(1)
     */
    public static void main(String[] args) {

       int[] arr = {95,78,98,99,100,50};
       //Starting our 1st iteration, nothing is sorted yet  {78,95,98,99,50,100} -- last index has the highest value now
       //Starting our 2nd iteration until (last - 1), (last index is already sorted)  {78,95,98,50,99,100} -- after iteration sorted until second last index
       //Starting our 3rd iteration until (last - 2), (n - 2 index is already sorted) {78,95,50,98,99,100} -- after iteration sorted until third last element
       //Starting our 4th iteration until (last - 3), (n - 3 index is already sorted) {78,50,95,98,99,100} -- after iteration sorted until fourth last element
       //Starting our 5th iteration until (last - 4), (n - 4 index is already sorted) {50,78,95,98,99,100} -- after iteration sorted until fifth last element
       //no need to sort the first element as in the last iteration it will be automatically sorted

       System.out.println("Unsorted Array: " + Arrays.toString(arr));

       for(int i = 0 ; i < arr.length - 1; i++) {
           for(int j = 0; j < arr.length - i - 1 ; j++) {
               if(arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
           }
       }

       System.out.println("Sorted Array: " + Arrays.toString(arr)); 

    }

}
