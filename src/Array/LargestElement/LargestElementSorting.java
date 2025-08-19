package Array.LargestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestElementSorting {
    public static void main(String[] args) {
        int arr[]={23,133,43,122,4,3,11};
        int max =0;
        Arrays.sort(arr);

        System.out.println("Largest Element :"+arr[arr.length-1]);
    }
}
