package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSortExample {

    public static void main(String[] args) {

        int[] arr1 = {10, 57, 65, 24, 26, 95, 46, 40, 3};
        int[] arr2 = {100, 570, 650, 240, 260, 950, 460, 400, 300};
        int[] arr = {100, 570, 650, 240, 260, 950, 460, 400, 300, 42, 2};
       // bucketSort(arr);
       int[] result =  bucketSort2(arr);
        System.out.println("Bucket sort :- " + Arrays.toString(result));

    }

    private static void bucketSort(int[] arr) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int j = 0; j < arr.length; j++) {
            buckets[hashing(arr[j])].add(arr[j]);
        }

        for (List list : buckets) {
            Collections.sort(list);
        }

        int k = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (Integer value : buckets[i]) {
                arr[k++] = value;
            }
        }
    }

    public static int hashing(int num) {
        /*if (num / 10 > 0) {
            while (num >= 10) {
                num /= 10;
            }
        } else return 0;
        return num;*/

        return num/10;

    }

    public static int[] bucketSort2(int[] arr) {
        // Create 10 buckets (0 to 9) for simplicity
        int numberOfBuckets = 10;
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];

        // Initialize the buckets
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Distribute the elements into the buckets
        for (int num : arr) {
            int bucketIndex = Math.min(num / 100, numberOfBuckets - 1); // Adjust bucket index based on value
            buckets[bucketIndex].add(num);
        }

        // Sort each bucket and concatenate the results
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket); // Sort each bucket
            sortedList.addAll(bucket); // Add sorted bucket to the result
        }

        // Convert the sorted list back to an array
        int[] sortedArray = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            sortedArray[i] = sortedList.get(i);
        }

        return sortedArray;
    }
}
