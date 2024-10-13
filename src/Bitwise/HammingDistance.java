package Bitwise;

public class HammingDistance {
    public static void main(String[] args)
    {
        int x=1;
        int y=4;
        System.out.println(hammingDistance(x,y));
    }
    static public int hammingDistance(int x, int y) {
        int ans=x^y;
        System.out.println(Integer.toBinaryString(ans));
        int count=0;
        while (ans>0)
        {
            int last=ans&1;

            if(last==0)count++;
            ans=ans>>1;
        }
        return count;
    }
}
