package MatrixArray;

import java.util.Arrays;

public class RowColWiseSortedBS {
    public static void main(String[] args) {
        int[][] arr={
                {11,12,13,23,45,65},
                {17,19,32,36,47,76},
                {21,25,37,45,53,79},
                {24,27,39,47,59,100},
        };
        System.out.println(Arrays.toString(search(arr,232)));
    }
    static int[] search(int [][] arr,int target)
    {
        int r=0;
        int c=arr.length-1;
        while(r< arr.length && c>=0)
        {
            if(target==arr[r][c])
            {
                return new int[]{r,c};
            } else if (target<arr[r][c]) {
                c--;
            } else if (target>arr[r][c]) {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
