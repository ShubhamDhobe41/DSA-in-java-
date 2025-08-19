package Array.com.ArrayNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
//        dynamic Array
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(12);


        int []arr1 = new int[4];
//        arr1[0]=42;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length-2; i++) {
            System.out.println("Enter " + i + " element :");
            int element = scanner.nextInt();
            arr1[i] = element;
         }

//        System.out.println(arr1);

        int age[] = {12, 32, 12, 42};

        printArray(arr1);
        insertData(arr1,2,78);
        printArray(arr1);
        deleteDataOneD(arr1,2);
        printArray(arr1);
    }

    public static void deleteDataOneD(int arr[],int position){
//        Shifting toward starting index
        for (int i=position;i<=arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
//    Traverse Array
    public static void printArray(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
        System.out.println();
    }
    public static void insertData(int arr[],int position ,int element){
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

}
