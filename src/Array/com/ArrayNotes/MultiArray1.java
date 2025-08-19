package Array.com.ArrayNotes;

public class MultiArray1 {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 3, 1},
                {4, 2, 1},
                {6, 2, 5}
        };

        myMethod(arr);

        System.out.println("Length Of Row: " + arr.length);
        System.out.println("Length of Column: " + arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void myMethod(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of array values: " + sum);
    }
}
