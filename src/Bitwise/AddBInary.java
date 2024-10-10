package Bitwise;

public class AddBInary {
    public static void main(String[] args)
    {
        String s1="1010";
        String s2="1011";
        System.out.println(addBinary(s1,s2));
    }
    static public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        StringBuilder sc=new StringBuilder();
        while (i>=0 || j>=0)
        {
            int sum=0;
            if(i>=0) sum=sum+a.charAt(i--)-'0';
            if(j>=0) sum=sum+b.charAt(j--)-'0';
            sum=sum+carry;
            if(sum>=2)
            {
                carry=1;
                sum=sum-2;
            }
            else {
                carry=0;
            }
            sc.append(sum);

        }
        if (carry==1)sc.append('1');
        sc.reverse();
        return sc.toString();
    }
}
