package Math;

public class NewtonSqureRootMethod {
    public static void  main(String[] args)
    {
        System.out.println(sqrtss(36));
    }
    static public double sqrtss(int n)
    {
        double x=n;
        double root;
        while (true)
        {
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1)
            {
                break;
            }
            x=root;
        }
        return root;
    }
}
