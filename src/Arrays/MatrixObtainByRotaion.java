package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixObtainByRotaion {
    public static void main(String[] args) {
        int [][] mat={{0,1},{1,0}};
        int [][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }

    static public boolean findRotation(int[][] mat, int[][] target) {
        int[][] arr2=new int[mat.length][mat[0].length];
        for(int i=0;i<4;i++) {
            if (check(mat, target)) {
                return true;
            }
            rotate(mat);
        }

       return false;

    }
    static boolean check(int[][] matrix,int[][] target)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    static void rotate(int [][] mat)
    {
        int[][] arr2=new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr2[j][i] = mat[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(arr2));
        for (int[] rev : arr2) {
            int i = 0;
            int j = rev.length - 1;
            while (i < j) {

                int temp = rev[i];
                rev[i] = rev[j];
                rev[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.deepToString(arr2));
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=arr2[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(mat));
    }
}
