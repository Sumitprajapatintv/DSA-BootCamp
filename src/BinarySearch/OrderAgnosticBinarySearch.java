package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int [] arr={2,3,5,6,23,45,56,654,4434};
        int [] arr ={25,24,12,11,6,4,3,2};
        boolean isAgon=arr[0]<arr[arr.length-1];
        System.out.println(orderAgonsticBinary(arr,24,isAgon));

    }
    static int orderAgonsticBinary(int[] arr,int target,boolean isAgon)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAgon)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else if(target>arr[mid])
                {
                    start=mid+1;

                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;

                }
            }
        }
        return -1;
    }
}
