package Array.Print2DArray;

import java.util.Arrays;

public class Print2DTostring {
    public static void main(String[] args) {
        int arr[][]=
                {
                        {2,3,2,1,4,5} ,
                        {6,3,2,1,4,5} ,
                        {7,3,3,1,4,5} ,
                        {3,3,2,1,6,5}
                };
        print2d(arr);
    }

    private static void print2d(int[][] arr) {
        //        print Array
        for (int[] ele :arr){
            System.out.println(Arrays.toString(ele));
        }
    }
}
