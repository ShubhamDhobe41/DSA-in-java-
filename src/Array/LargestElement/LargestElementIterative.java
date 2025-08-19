package Array.LargestElement;

public class LargestElementIterative {
    public static void main(String[] args) {
        int arr[]={23,133,43,122,4,3,11};
        largestArray(arr);
    }

    private static void largestArray(int[] arr) {
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
                break;
            }
        }
        System.out.println("Largest Element : "+ max);
    }
}
