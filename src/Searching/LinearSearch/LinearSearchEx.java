package Searching.LinearSearch;

public class LinearSearchEx {
    public static void main(String[] args) {
        int arr[]={21,32,21,12,42,32,21};
       linearSearch(arr,21);
    }
    //        find first occurance of element
    public static void linearSearch(int arr[],int target){
        int res =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                res = i;
                break;
            }
        }
        if (res < 0){
            System.out.println("Element is Not Found ");
        }else {
            System.out.println("Element found at index "+ res);

        }
    }
}
