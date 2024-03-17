package BinarySearch;

public class CeilOfANumber {
    public static void main(String[] args) {
        int [] arr={3,4,5,23,43,56,65,85};
        int ceilNumber=87;
        System.out.println(CeilNumber(arr,ceilNumber));
    }
    static int CeilNumber(int[] arr,int ceilNumber)
    {
        if(ceilNumber>arr[arr.length-1])
        {
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(ceilNumber>arr[mid])
            {
                start=mid+1;
            } else if (ceilNumber<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return start;

    }

}
