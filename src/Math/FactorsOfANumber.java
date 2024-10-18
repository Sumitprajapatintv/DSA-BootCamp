package Math;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfANumber {
    public static void main(String[] args)
    {
//        int number=20;
        factors(20);
    }
//    static public void factors(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            if(n % i==0)
//            {
//                System.out.print(i + " ");
//            }
//
//        }
//    }taken o(n) Complexity
static public void factors(int n)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n % i==0)
            {
                System.out.print(i + " ");
//                System.out.print(n/i + " ");
                ans.add(n/i);
            }

        }
        for(int j=ans.size()-1;j>=0;j--)
        {
            System.out.print(ans.get(j) + " ");
        }
    }
}
