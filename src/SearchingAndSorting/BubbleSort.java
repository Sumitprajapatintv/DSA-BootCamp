package SearchingAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int [] arr)
    {
        boolean isSwapped;
        for(int i=0;i<arr.length;i++)
        {
            isSwapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp;
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
            {
                break;
            }
        }
    }
}
