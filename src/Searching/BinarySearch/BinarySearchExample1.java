package Searching.BinarySearch;

import java.util.Arrays;
//    Recursive Approch
public class BinarySearchExample1 {
    private static int binarySearchEle(int[] arr, int low, int high, int element) {
        int count =1;
        while (low <= high) {
            System.out.println("Count : "+count );
            count++;
//            mid
            int mid = low + (high - low) / 2;

            if (arr[mid] == element) {
                return mid;
            }

             if (element < arr[mid]) {
                return binarySearchEle(arr,low,mid-1,element);
            }
             if (element > arr[mid]) {
                 return binarySearchEle(arr,low,mid+1,element);
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
        int foundIndex = binarySearchEle(arr, 0,arr.length-1,33);
       if (foundIndex == -1){
           System.out.println("element is not found ");
       }else {
           System.out.println("element is found at "+foundIndex);
       }
    }

}
