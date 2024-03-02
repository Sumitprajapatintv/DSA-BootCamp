package LinearSearch;

import java.util.Arrays;

public class getMinValue {
    public static void main(String[] args) {
        int[][] arr={
                {4,32,3,4},
                {87,43,53,54},
                {99,43,32,43},
                {54,32,66,44}
        };
        System.out.println(minValue(arr));

    }
    static int minValue(int[][] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]<min)
                {
                   min=arr[row][col];
                }
            }
        }
        return min;
    }
}
