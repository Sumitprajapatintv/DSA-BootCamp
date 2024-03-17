package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int [] arr={3,4,5,23,43,56,65,85};
        int floorNumber=2;
        System.out.println(floorNumber(arr,floorNumber));
    }
    static int floorNumber(int[] arr,int floorNumber)
    {
        if(floorNumber<arr[0])
        {
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(floorNumber>arr[mid])
            {
                start=mid+1;
            } else if (floorNumber<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return end;

    }
}
