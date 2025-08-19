package Array.LargestElement;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]= {2,1,4,2,5,6,7,9,4,-2,-1};
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if ( arr[i] > secondMax  && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);

    }
}
