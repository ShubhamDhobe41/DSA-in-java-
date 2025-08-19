package Searching.LinearSearch;

public class LinearSearchEx2 {
    public static void main(String[] args) {
        int arr[]={21,32,21,12,42,32,21};
       linearSearch(arr,21,false);
        linearSearch(arr,21,true);
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
}
