package Sorting;

public class BubbleSortRecursion {
    public static void bubbleSort(int arr[],int n){
          if(n==1){
              return;
          }
          int didSwap =0;
        for (int i = 0; i <=n-2 ; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                didSwap = 1;
            }
        }
        if (didSwap == 0) return;
        bubbleSort(arr, n - 1);
          

    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        bubbleSort(arr,arr.length);
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
