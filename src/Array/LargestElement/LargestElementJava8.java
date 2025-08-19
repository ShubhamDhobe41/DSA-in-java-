package Array.LargestElement;

import java.util.Arrays;

public class LargestElementJava8 {
    public static void main(String[] args) {
        int arr[]={23,133,43,122,4,3,11};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum Array "+max);
    }
}
