package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatrixDioganalSum {
    public static void main(String[] args) {
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    static public int diagonalSum(int[][] mat) {
       int rowLength= mat.length;;
       int collength=mat[0].length;
       int sum=0;
        for(int row=0;row<rowLength;row++)
        {
            for(int col=0;col<collength;col++)
            {
                if(row==col)
                {
                    sum+=mat[row][col];
                }
                if((row+col)==rowLength-1)
                {
                    if(row!=col)
                    {
                        sum+=mat[row][col];
                    }
                }
            }
        }
        return sum;
    }
}
