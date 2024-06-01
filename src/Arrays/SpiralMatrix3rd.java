package Arrays;

import java.util.Arrays;

public class SpiralMatrix3rd {
    public static void main(String[] args) {
        int rows=5;
        int cols=6;
        int rStart=1;
        int colStart=1;
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows,cols,rStart,colStart)));
    }
   static  public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
          int arr2[][]=new int[rows][cols];
          return arr2;
    }
}
