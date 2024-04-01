package SearchingAndSorting;

import java.util.Arrays;

public class SelectioSort {
    public static void main(String[] args) {
        int [] arr={4,3,6,43,32,53,38};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr)
    {
         for(int i=0;i<arr.length;i++)
         {
             int lastIndex=arr.length-i-1;
             int maxIndex=maxIndexs(arr,0,lastIndex);
             swap(arr,maxIndex,lastIndex);
         }
    }
    static int maxIndexs(int [] arr,int start,int end)
    {
         int max=start;
         for(int i=start;i<=end;i++)
         {
             if(arr[max]<arr[i])
             {
                 max=i;
             }
         }
         return max;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
