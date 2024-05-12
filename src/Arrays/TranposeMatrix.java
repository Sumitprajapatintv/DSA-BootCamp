package Arrays;

import java.util.Arrays;

public class TranposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static public int[][] transpose(int[][] matrix) {
        int rowLength=matrix.length;
        int colLenght=matrix[0].length;
        int [][] arr2=new int[colLenght][rowLength];
        for(int row=0;row<rowLength;row++)
        {
            for(int col=0;col<colLenght;col++)
            {
                arr2[col][row]=matrix[row][col];
            }
        }
        return arr2;
    }
}
