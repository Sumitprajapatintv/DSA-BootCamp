package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckeyNumberInMatrix {
    public static void main(String[] args) {
        int[][] arr={{3, 7, 8},{9,11,13},{15,16,17}};
        System.out.println((luckyNumbers(arr)));
    }
    static public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr2=new ArrayList<>();
        int rowLength=matrix.length;
        int colLength=matrix[0].length;
        int[] row=new int[rowLength];
        int[] col=new int[colLength];
        for(int i=0;i<matrix.length;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for (int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                }

                if(matrix[j][i]>max)
                {
                    max=matrix[j][i];
                }
                col[j]=max;
            }
            row[i]=min;


        }
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<colLength;j++)
            {
                if(row[i]==col[j]);
                {
                    arr2.add(row[i]);
                }
            }
        }

        return arr2;
    }


}
