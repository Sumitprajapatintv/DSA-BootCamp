package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckeyNumberInMatrix {
    public static void main(String[] args) {
        int[][] arr={{7,8},{1,2}};
        System.out.println(luckyNumbers(arr));
    }
    static public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr2=new ArrayList<>();
        int rowLength=matrix.length;
        int colLength=matrix[0].length;
        int[] row=new int[rowLength];
        int[] col=new int[colLength];
        int p=0,q=0;
        for (int i = 0; i < rowLength; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < colLength; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            row[p++] = min;
        }

        // Find the maximum element in each column
        for (int j = 0; j < colLength; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rowLength; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            col[q++] = max;
        }
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(row[i]==col[j])
                {
                    arr2.add(row[i]);
                }
            }
        }

        return arr2;
    }


}
