package Array.com.ArrayNotes;
import java.util.Scanner;

public class ArraysEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Two dimensional Array
        int arr[][]= new int[5][2];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter"+j+" Element :");
                int element = scanner.nextInt();
                arr[i][j]=element;
            }
        }
        printTwoD(arr);
        insertDataTwoD(arr,0,1,5);
        printTwoD(arr);
        deleteDataTwoD(arr,0,1);
        UpdateTwoD(arr,0,0,6);
        printTwoD(arr);

//        JacK's Array -  not defined second dimension size
        int myArray[][]= new int[4][];
        

    }
    public static void printTwoD(int arr[][]){
        for (int i=0;i< arr.length;i++){
            System.out.println("for "+i+" index");
            printArrayOne(arr[i]);
        }
    }
    public static void printArrayOne(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
        System.out.println();
    }
    public static void UpdateOneD(int arr[],int position , int element){
        int size = arr.length;
        if (position < 0 || position > size-1){
            System.out.println("wrong Position");
            return;
        }
        arr[position]=element;
    }
    public static void UpdateTwoD(int arr[][],int position1,int position2 , int element){
        int size1 = arr.length;
        if (position1 < 0 || position1 > size1-1){
            System.out.println("wrong Position");
            return;
        }
        int size2 = arr[position1].length;
        if (position2 < 0 || position2 > size2-1){
            System.out.println("wrong Position");
            return;
        }
        arr[position1][position2]=element;
    }
    public static void insertDataOneD(int arr[],int position ,int element){
        int size = arr.length;
        if (position < 0 || position > size-1){
            System.out.println("wrong Position");
            return;
        }
//        shifting end
        for (int i=size-2;i >=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=element;

    }
    public static void deleteDataOneD(int arr[],int position){
//        Shifting toward starting index
        for (int i=position;i<=arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
    public static void insertDataTwoD(int arr[][],int pos1,int pos2 ,int element){
        insertDataOneD(arr[pos1],pos2,element);
    }
    public static void deleteDataTwoD(int arr[][],int pos1,int pos2 ){
        deleteDataOneD(arr[pos1],pos2);
    }

}
