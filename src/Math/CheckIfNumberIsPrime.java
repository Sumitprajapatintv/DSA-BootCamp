package Math;

public class CheckIfNumberIsPrime {
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(16));
    }
    static public boolean isPowerOfTwo(int n) {
        int count=0;
        while (n!=0)
        {
            int last=n&1;
            if(last==1)count++;
            n=n>>1;
        }
        if(count!=1)return false;
        return true;
    }
}
