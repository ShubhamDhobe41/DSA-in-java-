package StriverDSA.Array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayBasic {
    public static void printArray(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void deleteElement(int[] arr, int position) {
        for (int j = position; j <= arr.length - 2; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = 0;

    }
    public static void insertElement(int arr1[], int position, int element) {

        for (int i = arr1.length - 2; i >= position; i--) {
            arr1[i + 1] = arr1[i];
        }
        arr1[position] = element;
        printArray(arr1);
    }
    public static void modifyArray(int arr[]) {
        int count = 5;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] += count;
        }
        printArray(arr);
    }
    private static void reverseTraversal(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }
    private static void linearTraversal(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void usingWhileLoop(int[] arr) {
        int ele = 0;
        int size1 = arr.length;
        while (ele < size1) {
            System.out.print(arr[ele] + ",");
            ele++;
        }
    }
    private static void usinfForEachLoop(int[] arr) {
        for (int arrEle : arr) {
            System.out.print(arrEle + " ");
        }
    }
    private static void usingForLoop(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void largestElement(int[] arr) {
//        Largest element - Brute-Force
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
    private static void searchElement(int[] arr) {
        int target = 5;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.print("Element found at index : " + i + " and Value " + arr[i]);
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {3, 4, 2, 6, 1, 5};
//        largestElement(arr);

//        using For Loop
        usingForLoop(arr);

        System.out.println();
//        using for Each Loop
        usinfForEachLoop(arr);
        System.out.println();

//        using while loop
        usingWhileLoop(arr);
        System.out.println();

//        Linear Traveral
        linearTraversal(arr);
        System.out.println();
//      reverse Traversal
        reverseTraversal(arr);
        System.out.println();
//     Searching element
        searchElement(arr);
        System.out.println();
//        Modify Array
        modifyArray(arr);
        System.out.println();

//        Insert Element
        insertElement(arr, 2, 9);
        System.out.println();

//        Delete Element
        deleteElement(arr, 2);
        printArray(arr);


    }
}


