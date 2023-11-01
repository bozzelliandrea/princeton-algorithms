package github.algorithms.searching;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return -1;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}