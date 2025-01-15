package in.dsadec.com;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        int result[] = nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] nextPermutation(int arr[]) {
        // Iterate from the end of the array to find the first decreasing element
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0 && arr[i - 1] < arr[i]) { // Check if arr[i-1] is less than arr[i]
                int nextGreaterIndex = greaterNextElement(arr, i - 1);
                swap(arr, i - 1, nextGreaterIndex); // Swap with the next greater element
                reverse(arr, i, arr.length - 1); // Reverse the rest of the array
                return arr;
            }
        }

        // If no such decreasing element is found, reverse the array
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    static int greaterNextElement(int arr[], int index) {
        // Find the smallest element greater than arr[index] to the right of index
        int nextGreaterIndex = index + 1;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > arr[index] && arr[i] <= arr[nextGreaterIndex]) {
                nextGreaterIndex = i;
            }
        }
        return nextGreaterIndex;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
