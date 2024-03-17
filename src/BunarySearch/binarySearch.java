package BunarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={-23,-4,-2,0,2,4,5,34,43,54,86,99};
        System.out.println(binarySearchfunc(arr,254));
    }
        static int binarySearchfunc(int[] arr,int target)
        {
            int start=0;
            int end=arr.length-1;
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
