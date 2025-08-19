package Searching.LinearSearch;

public class LinearSearchEx5 {
    public static void main(String[] args) {
        int arr[]={21,32,21,12,42,32,21};
        int arr2d[][]={
                {21,23,43,54,43,22},
                {12,23,45,54,11,29},
                {21,32,42,33,65,22},
                {25,25,49,54,43,20}
        };
//       linearSearch(arr,21,false);
//        linearSearch(arr,21,true);
//        linearSearchMultipleElement(arr,21);
//        linearSearchMaxElement(arr);
//        linearSearchMaxElement1(arr);
//        linearSearchMinElement(arr);
//        linearSearchMinElement1(arr);
          linearSearchTwoMatrix(arr2d,22,false);
//        linearSearchTwoMatrix(arr2d,22,true);
    }


    private static void linearSearchTwoMatrix(int[][] arr,int target,boolean last) {
         int outer=0;
         int inner=1;
         boolean found = false;
         for (int i=0;i<arr.length;i++){
             for (int j=0;j<arr[i].length;j++){
                 if (target==arr[i][j]){
                     outer=i;
                     inner=j;
                     if (last==false){
                         found=true;
                         break;
                     }

                 }

             }
             if (found==true){
                 break;
             }
         }
        if (outer == -1){
            System.out.println("element is not found ");
        }else {
            System.out.println("element found at Index :"+outer+"  "+inner);
        }
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
