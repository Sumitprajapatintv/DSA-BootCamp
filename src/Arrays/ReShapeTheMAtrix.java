package Arrays;

import java.util.Arrays;

public class ReShapeTheMAtrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(arr,1,4)));
    }

    static public int[][] matrixReshape(int[][] mat, int r, int c) {
         int[][] ans=new int[r][c];
         int row=0,col=0;

        if(mat.length*mat[0].length==r*c)
        {
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    ans[row][col]=mat[i][j];
                    col++;
                    if(col==c)
                    {
                        row++;
                        col=0;
                    }
                }
            }
        }
        else {
            return mat;
        }
        return ans;
    }
}
