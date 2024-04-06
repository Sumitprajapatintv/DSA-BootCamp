package SearchingAndSorting;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int [] arr={1,1};
        System.out.println(Arrays.toString(setMis(arr)));

    }
    public static int[] setMis(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            if(arr[l]!=l+1)
            {
                return new int[] {arr[l],l+1};
            }
        }
       return new int[] {-1,-1};
    };


    public static void swap(int [] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
