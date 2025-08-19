package StriverDSA.Array;

import java.util.Arrays;

public class LargestElement {
    public static void largestElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]){
                max= arr[i];
            }
        }
        System.out.println("Largest Element : "+max);
    }
    public static void main(String[] args) {
        int arr[]= {2,5,1,3,0,11};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);
        largestElement(arr);
    }
}
