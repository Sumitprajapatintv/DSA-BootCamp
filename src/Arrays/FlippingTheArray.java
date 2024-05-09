package Arrays;

import java.util.Arrays;

public class FlippingTheArray {
    public static void main(String[] args) {
        int [][] arr={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
//        flipAndInvertImage(arr);

    }
    static public int[][] flipAndInvertImage(int[][] image) {
        int rowLength=image.length;
        int colLength=image[0].length;
        int[][] arr2=new int[rowLength][colLength];
        for(int row=0;row<rowLength;row++)
        {
            int colans=0;
            for(int col=colLength-1;col>=0;col--)
            {
                 arr2[row][colans]=image[row][col];
                 colans++;
            }
        }
        for(int row=0;row<rowLength;row++)
        {
//            int colans=0;
            for(int col=colLength-1;col>=0;col--)
            {
                if(arr2[row][col]==0)
                {
                    arr2[row][col]=1;
                }
                else {
                    arr2[row][col]=0;
                }
            }
        }
        return arr2;
    }
}
