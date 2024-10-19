package Bitwise;

import java.util.Arrays;
import java.util.Collections;

public class FindKthBitinNthBinaryString {
    public static void  main(String[] args)
    {
        System.out.println(findKthBit(3,1));
    }
    static  public char findKthBit(int n, int k) {
        StringBuilder sc=new StringBuilder();
        String S1="0";
        for(int i=0;i<=n;i++)
        {
//            System.out.println(Integer.toBinaryString(Integer.parseInt(S1)));
//            sc.append(S1);

            S1=S1+"1"+(Integer.toBinaryString(Integer.parseInt(S1)));
            System.out.println(S1);
        }
        return 'a';
    }

}
