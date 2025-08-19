package Sorting;

public class MergeSort {
    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);       // Correct: Left half
        divide(arr, mid + 1, end);     // Correct: Right half
        conquer(arr, start, mid, end); // Merge
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int mergeIndex = 0;

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                merge[mergeIndex++] = arr[index1++];
            } else {
                merge[mergeIndex++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merge[mergeIndex++] = arr[index1++];
        }

        while (index2 <= end) {
            merge[mergeIndex++] = arr[index2++];
        }

        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
