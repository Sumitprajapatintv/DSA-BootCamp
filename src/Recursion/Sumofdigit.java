package Recursion;

public class Sumofdigit {
    public static void main(String[] args)
    {
        System.out.println(digitSum(1345));
    }
    static public int digitSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return digitSum(n/10)+n%10;
    }
}
