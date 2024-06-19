package BinarySearch;

public class CountNegativeNumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[] arr={4,3,2,1};
        System.out.println(countBinarySearch(arr));
//        System.out.println(countNegatives(grid));

    }
    static public int countNegatives(int[][] grid) {
       int count=0;
       for(int[] itm:grid)
       {
           count+=countBinarySearch(itm);
       }
       return count;
    }
    static int countBinarySearch(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<0) {
                end = mid - 1;
            }
            else {
                start=mid+1;
            }
        }
        return arr.length-start;
    }
}
