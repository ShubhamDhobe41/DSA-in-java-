package Array.com.smartPrograming;

public class DeleteElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int delete_element =100;
        int count =100;
        for (int i=0;i<arr.length;i++){
            if (delete_element==arr[i]){
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("element Not found ");
        }else {
            for (int i=0;i< arr.length-1;i++){
                System.out.println(arr[i]);
            }
        }

    }
}
