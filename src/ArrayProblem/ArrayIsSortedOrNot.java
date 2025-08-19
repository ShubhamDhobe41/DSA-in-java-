package ArrayProblem;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        isSorted(arr);
        if(isSorted(arr)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }

    private static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1] > arr[i]){
                return false;
            }

        }
        return true;
    }
}
