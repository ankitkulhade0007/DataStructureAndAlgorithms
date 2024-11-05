package algorithm.search;

public class LinearSearchExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isExist = linearSearch(arr, 5);
        System.out.println("linearSearch :- "+ isExist);
    }

    private static boolean linearSearch(int[] arr, int searchNumber) {
        for (int num : arr) {
            if (num == searchNumber) {
                return true;
            }
        }
        return false;
    }
}
