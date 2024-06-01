package Arrays;

import java.sql.Array;
import java.util.*;

public class SetMatrixToZeroes {
    public static void main(String[] args) {
        int[][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));

    }
    static public void setZeroes(int[][] matrix) {
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    a.add(i);
                    b.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(a.contains(i))
                {
                  matrix[i][j]=0;
                }
                if(b.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }

    }
}
