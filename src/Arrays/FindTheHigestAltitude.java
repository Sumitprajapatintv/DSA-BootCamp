package Arrays;

public class FindTheHigestAltitude {
    public static void main(String[] args) {
        int [] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));

    }
    static public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            if(sum>max)
            {
                max=sum;
            }
        }
        if(max<=0)
        {
            return 0;
        }
        return max;
    }
}
