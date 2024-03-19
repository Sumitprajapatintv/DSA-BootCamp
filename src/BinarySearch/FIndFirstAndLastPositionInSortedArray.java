package BinarySearch;

public class FIndFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] brr = searchRange(arr, 7);
        for(int i:brr)
        {
            System.out.println(i+" ");
        }

    }

    static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        boolean findFirstIndex;
        arr[0] = search(nums, target, true);
        if(arr[0]!=-1)
        {
            arr[1] = search(nums, target, false);

        }
        return arr;
    }

    static int search(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}