package SearchingAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
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
