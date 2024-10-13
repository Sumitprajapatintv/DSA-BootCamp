package Bitwise;

import java.util.Arrays;

public class CountingBits {
    public  static void  main(String[] args)
    {
          int n=5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    static public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int index=0;
        for(int i=0;i<=n;i++)
        {
            int k=i;
            int count=0;
            while (k>0)
            {
                int last=k&1;
                if(last==1)count++;
                k=k>>1;
            }
          ans[index++]=count;
        }
    return ans;
    }
}
