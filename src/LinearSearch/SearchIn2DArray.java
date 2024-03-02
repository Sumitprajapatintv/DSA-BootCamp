package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {4,32,3,4},
                {87,43,53,54},
                {99,43,32,43},
                {54,32,66,44}
            };
        int target=43;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}


