package ArrayProblem;

public class ArrayRemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,30,40,50};
        int newSize=removeDuplicates(arr);
        for (int i = 0; i <newSize ; i++) {
            System.out.print(arr[i]+"  ");
        }

    }



    private static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;
        int temp =1;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1] != arr[i] ){
                arr[temp++]= arr[i];
            }

        }
        return temp;

    }
}
