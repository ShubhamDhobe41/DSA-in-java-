package Array.PassingArrayToMethod;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int arr[]={22,32,43,12,24};
        System.out.println(arr[1]);
        changeArrayElement(arr);
    }

    private static void changeArrayElement(int[] changeArr) {
           int num = changeArr[1]=54;
        System.out.println(num);
    }

}
