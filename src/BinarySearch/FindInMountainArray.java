package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int peakElemet=peakIndexInMountainArray(arr);
        boolean isAgon=arr[0]<arr[peakElemet];
        int searchInLeft=orderAgonsticBinary(arr,0,0,peakElemet);
        if(searchInLeft!=-1)
        {
            System.out.println(searchInLeft);
        }
        else {
            int searchInRight=orderAgonsticBinary(arr,3,peakElemet+1,arr.length-1);
            System.out.println(searchInRight);
        }


    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgonsticBinary(int[] arr,int target,int start,int end)
    {
        boolean isAgon=arr[start]<arr[end];

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
