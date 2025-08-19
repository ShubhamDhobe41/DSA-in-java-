package Array.com.smartPrograming;

public class InsertionArrayUsingIndex {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int index = 3;
        int element = 100;

        for(int i= args.length-1; i > index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
