package BinarySearch;

public class MountainArray {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr) {


        int i=0;
        while(arr[i]<arr[i+1])
        {
            i++;
        }
        return i;
    }

}
