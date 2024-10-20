package Bitwise;

public class PowerofTwo {
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(16));
    }
    static public boolean isPowerOfTwo(int n) {
        return ((n&(n-1))==0);
    }
}
