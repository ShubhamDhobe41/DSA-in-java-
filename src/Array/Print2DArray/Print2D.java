package Array.Print2DArray;

public class Print2D {
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
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
