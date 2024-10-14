package algorithm.search;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("isExistBybinarySearch :- " + isExistBybinarySearch(arr, 10));

        System.out.println("isExistBinarySearchRecursive :- " + isExistBinarySearchRecursive(arr, 10));
    }

    private static boolean isExistBybinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    private static boolean isExistBinarySearchRecursive(int[] arr, int target) {
        return recursionBinarySearch(arr, 0, arr.length - 1, target);
    }

    public static boolean recursionBinarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (target > arr[mid]) {
            return recursionBinarySearch(arr, mid + 1, end, target);
        } else {
            return recursionBinarySearch(arr, start, mid - 1, target);
        }
    }
}
