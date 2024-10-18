package Bitwise;

import java.util.HashMap;

public class SortIntegerByNumberOfOneBits {
    public static  void  main(String[] args)
    {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(sortByBits(arr));
    }
    static  public int[] sortByBits(int[] arr) {
        int[] ans=new int[arr.length];

        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hp.put(arr[i],hammingWeight(i));
        }

        System.out.println(hp);
        return ans;
    }
    static public int hammingWeight(int n) {
        int count=0;
        while (n>0)
        {
            int last=n&1;
            if(last==1)count++;
            n=n>>1;
        }
        return count;


    }

}
