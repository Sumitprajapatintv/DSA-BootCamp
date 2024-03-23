package BinarySearch;

public class FIndTheElementInInfinteSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9,23,25,26,43,54,65,64,535,5563};
        int tartget=54;
        System.out.println(findingRannge(arr,tartget));



    }

    static int findingRannge(int [] arr,int target)
    {
         //start with window size of 2
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
