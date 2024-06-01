package BinarySearch;

public class SearchInARotatedArray {
    public static void main(String[] args) {
        int [] arr={5,1,3};
        int target=5;
        int pivot=findPivotElement(arr);
        if(pivot==-1)
        {
            System.out.println(BinarySearch(arr,0, arr.length-1, target));;
        }
        else if (arr[pivot]==target)
        {
            System.out.println(pivot);
        }
        else if(target>=arr[0])
        {
            System.out.println(BinarySearch(arr,0,pivot-1,target));
        }
        else {
            System.out.println(BinarySearch(arr,pivot+1,arr.length-1,target));
        }



    }
    static int findPivotElement(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            //5 6 7 12 13 14 15 1 2 3 7
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            } else if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;

            } else if (arr[start]>=arr[mid]) {
                end=mid-1;

            } else if (arr[start]<=arr[mid]) {
                start=mid+1;

            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
