package Array;

public class CountNumberGreaterThanGivenNumber {
    public static void main(String[] args) {
        int arr[]= {12,43,53,23,45,76,54,77};
        int element = 35;
        int count = 1;
        for (int i = 0; i < arr.length ; i++) {
            if (element < arr[i]){
                System.out.println("Count Number :"+count);
                count++;
                System.out.println(arr[i]);
            }
        }
    }
}
