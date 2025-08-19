package Array.Operations;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.print("Using For Loop : ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.print("Using For Each Loop : ");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
