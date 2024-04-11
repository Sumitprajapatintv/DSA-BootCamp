package String;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5(10);
    }
    /*
    *****
    *****
    *****
    *****
    *****
     */
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    /*
     *
     **
     ***
     ****
     *****
     */
    static void pattern2(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<row;col++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    /*
     *****
     ****
     ***
     **
     *
     */
    static void pattern3(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    /*
    1
    12
    123
    1234
    12345
     */
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }

    }
    /*

     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     */
    static void pattern5(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
