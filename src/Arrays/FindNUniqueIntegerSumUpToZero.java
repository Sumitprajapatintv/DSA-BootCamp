package Arrays;

import java.util.Arrays;

public class FindNUniqueIntegerSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }
    static public int[] sumZero(int n) {
        int[] arr2=new int[n];
        if(n%2==0)
        {
            for (int i=0;i<n;i=i+2)
            {
                arr2[i]=i+1;
                arr2[i+1]=-(i+1);
            }
        }
        else {
            for (int i=0;i<n-1;i=i+2)
            {
                arr2[i]=i+1;
                arr2[i+1]=-(i+1);
            }
            arr2[n-1]=0;
        }
        return arr2;
    }
}
