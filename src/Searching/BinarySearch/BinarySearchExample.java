package Searching.BinarySearch;

import java.util.Arrays;
//    Iterative Approch
public class BinarySearchExample {
    private static int binarySearchEle(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        int count =1;
        while (low <= high) {
            System.out.println("Count : "+count );
            count++;
//            mid
            int mid = low + (high - low) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (element < arr[mid]) {
                high= mid-1;
            } else if (element > arr[mid]) {
                low=mid+1;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {32, 33, 22, 43, 54, 52, 11};
        Arrays.sort(arr);
        System.out.println("Element :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int foundIndex = binarySearchEle(arr, 11);
       if (foundIndex == -1){
           System.out.println("element is not found ");
       }else {
           System.out.println("element is found at "+foundIndex);
       }
    }

}
