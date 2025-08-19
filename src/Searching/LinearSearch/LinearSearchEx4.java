package Searching.LinearSearch;

public class LinearSearchEx4 {
    public static void main(String[] args) {
        int arr[]={21,32,21,12,42,32,21};
//       linearSearch(arr,21,false);
//        linearSearch(arr,21,true);
//        linearSearchMultipleElement(arr,21);
//        linearSearchMaxElement(arr);
//        linearSearchMaxElement1(arr);
//        linearSearchMinElement(arr);
        linearSearchMinElement1(arr);

    }
    private static void linearSearchMinElement(int[] arr) {
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min){
                min=arr[i];

            }
        }
        System.out.println(min);
    }
    private static void linearSearchMinElement1(int[] arr) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min){
                min=arr[i];

            }
        }
        System.out.println(min);
    }
    private static void linearSearchMaxElement(int[] arr) {
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
    private static void linearSearchMaxElement1(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }

    //        find first occurance of element
    public static void linearSearch(int arr[],int target,boolean lastEle){
        int res =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                res = i;
                if (lastEle == false){
                    break;
                }
            }
        }
        if (res < 0){
            System.out.println("Element is Not Found ");
        }else {
            System.out.println("Element found at index "+ res);

        }
    }
    public static void linearSearchMultipleElement(int arr[],int target){
        int ans[]= new int[arr.length];
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                ans[k] = i;
                k++;

            }
        }
        if (k == 0){
            System.out.println("Element is Not Found ");
        }else {
           for (int i=0;i< k ; i++){
               System.out.println("Elements :"+ ans[i]);
           }

        }
    }
}
