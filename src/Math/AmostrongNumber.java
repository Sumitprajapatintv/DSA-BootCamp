package Math;

public class AmostrongNumber {
    public static void main(String[] args)
    {
        System.out.println(armstrongNumber(153));
    }
    static String armstrongNumber(int n) {
         int sum=0;
         int number=n;
        while (n!=0)
        {
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if(number!=sum)
        {
            return "false";
        }
        return "true";
        // code here
    }
}
