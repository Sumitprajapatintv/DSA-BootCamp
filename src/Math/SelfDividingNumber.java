package Math;
import java.util.*;

public class SelfDividingNumber {
    public static void main(String[] args)
    {
        System.out.println(selfDividingNumbers(1,22));
    }
    static public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
          for(int i=left;i<=right;i++)
          {
              if(isSelf(i))ans.add(i);
          }
          return ans;
    }
    static public boolean isSelf(int n)
    {
        while (n>0)
        {
            int lastDiit=n%10;
            System.out.println(n%lastDiit!=0);
            if(n%lastDiit!=0)
            {
                return false;
            };
            n=n/10;
        }
        return true;
    }
}
