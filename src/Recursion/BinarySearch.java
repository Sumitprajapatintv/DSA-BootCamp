package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={3,5,6,32,54,65,112,343};
        System.out.println(Binary(arr,5,0,arr.length-1));
    }
    static int Binary(int[] arr,int target, int start,int end)
    {
        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return Binary(arr,target,start,mid-1);
        }
        return Binary(arr,target,mid+1,end);
    }
}
