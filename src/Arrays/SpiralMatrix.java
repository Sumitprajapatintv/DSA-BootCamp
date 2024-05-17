package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rowLength=matrix.length;
        int count=0;
        int colLength=matrix[0].length;
        int firstRow=0;
        int firstColumn=0;
        int lastRow=rowLength-1;
        int lastColumn=colLength-1;

        int total=rowLength*colLength;

         while (count<total) {
             for (int i = firstColumn; count<total && i <= lastColumn; i++) {
                 ans.add(matrix[firstRow][i]);
                 count++;

             }
             firstRow++;
             for (int i = firstRow;count<total && i <= lastRow; i++) {
                 ans.add(matrix[i][lastColumn]);
                 count++;

             }
             lastColumn--;
             for (int i = lastColumn;count<total && i >= firstColumn; i--) {
                     ans.add(matrix[lastRow][i]);
                     count++;
             }
             lastRow--;
             for (int i = lastRow;count<total && i >=firstRow; i--) {
                     ans.add(matrix[i][firstColumn]);
                    count++;
                 }
             firstColumn++;

         }
        return ans;
    }
}
