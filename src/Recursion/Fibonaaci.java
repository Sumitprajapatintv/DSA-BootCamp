package Recursion;

public class Fibonaaci {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n)
    {
        //Base Condition
        if(n<2)
        {
            return n;
        }
        //
        return fib(n-1)+fib(n-2);
    }
}
