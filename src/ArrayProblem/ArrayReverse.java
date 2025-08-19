package ArrayProblem;

public class ArrayReverse {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        ArrayReverse(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void ArrayReverse(int[] arr) {
        int n = arr.length;
        int temp[]=new int[n];
        for (int i = 0; i < n ; i++) {
            temp[i]=arr[n-i-1];
        }
        for (int i = 0; i < n ; i++) {
            arr[i]=temp[i];
        }
    }
}
