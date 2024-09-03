package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {

        //Added a comment
    
        int[] arr = {18,55,44,79,1,5,0,99};    
        //ascending order = [0,1,5,18,44,55,79,99]
        //descending order = [99,79,55,44,18,5,1,0]
    
        //selectionSortAscendingOrderFromFirstElement(arr);
    
        //selectionSortDescendingOrderFromFirstElement(arr);
    
        //selectionSortAscendingOrderFromLastElement(arr);
    
        selectionSortDescendingOrderFromLastElement(arr);
      }
    
    private static void selectionSortDescendingOrderFromLastElement(int[] arr) {
        
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
    
        for(int i = arr.length - 1; i > 0 ; i--) {
    
            int index = i;
    
            for(int j = i - 1; j >= 0 ; j--) {
    
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
    
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("Sorted Array in descending order from last element: " + Arrays.toString(arr));
    }
    
    private static void selectionSortAscendingOrderFromLastElement(int[] arr) {
        
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
    
        for(int i = arr.length - 1; i > 0 ; i--) {
    
            int index = i;
    
            for (int j = i - 1; j >= 0 ; j--) {
    
                if(arr[j] > arr[index]) {
                    index = j;
                }
    
            }
    
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array in ascending order using last element: " + Arrays.toString(arr));
    }
    
    private static void selectionSortDescendingOrderFromFirstElement(int[] arr) {
        
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
    
        for(int i = 0; i < arr.length - 1; i++) {
    
            int index = i;
    
            for(int j = i + 1 ; j < arr.length ; j++) {
                
                if(arr[j] > arr[index]) {
                    index = j;
                }
            }
    
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    
        System.out.println("Sorted Array in descending order using first element: " + Arrays.toString(arr));
    }
    
    private static void selectionSortAscendingOrderFromFirstElement(int[] arr) {
        
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
    
        for(int i = 0; i < arr.length - 1; i++) {
    
            int index = i;
    
            for(int j = i + 1; j < arr.length ; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
    
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    
        System.out.println("Sorted array in ascending order using first element: " + Arrays.toString(arr));
    }  

}
