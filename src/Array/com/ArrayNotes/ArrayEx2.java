package Array.com.ArrayNotes;

public class ArrayEx2 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
//        int[] numbers = {10, 20, 30, 40, 50};
//        String []names = {"Alice", "Bob", "Charlie"};
//        System.out.println(numbers);
//        System.out.println(names);


//        int arr[] = new int[5];
//        arr[0] = 2;
//        arr[1] = 12;
//        arr[2] = 22;
//        arr[3] = 3232;
//        arr[4] = 42;
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > res) {
//                res = arr[i];
//            }
//        }
//        System.out.println("The largest element in the array is: " + res);


//        print array in reverse order
//        int arr1[] = {1, 2, 43, 22, 54, 12, 44, 22};
//
//        for (int i = arr1.length - 1; i >= 0; i--) {
//            System.out.println("Element at index " + i + ": " + arr1[i]);
//        }


//        Sum of array
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            sum = sum + arr1[i];
//        }


//        TwoD Array

        int arr[][]= new int[3][3];
        arr[0][0]=5454;
        arr[0][1]=4655;
        arr[0][2]=7899;
        arr[1][0]=1562;
        arr[1][1]=7551;
        arr[1][2]=3215;
        arr[2][0]=4511;
        arr[2][1]=2123;
        arr[2][2]=2023;


        System.out.println(arr[0][2]);

        for (int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.println("Element : "+arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");

        int arr1[][]={{121,321,211},{321,122,132},{654,543,433}};
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                System.out.println("Element : "+arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");
        char arr3[][]= new char[3][];
        arr3[0]= new char[2];
        arr3[1]= new char[3];
        arr3[2]= new char[2];

        arr3[0][0]='a';
        arr3[0][1]='b';
        arr3[1][0]='d';
        arr3[1][1]='e';
        arr3[1][2]='f';
        arr3[2][0]='g';
        arr3[2][1]='h';


        for(int i=0;i<arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }






    }

}
