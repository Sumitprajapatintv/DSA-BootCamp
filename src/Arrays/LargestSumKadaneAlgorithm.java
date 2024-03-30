package Arrays;

public class LargestSumKadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(LargestSum(arr));
    }
//    static int LargestSum(int[] arr)//This is The BruteForce Approch(O(n^2))
//    {
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//            int sum=0;
//          for(int j=i;j<arr.length;j++)
//          {
//              sum+=arr[j];
//              largest=Math.max(largest,sum);
//          }
//        }
//        return largest;
//    }
static int LargestSum(int[] arr)//This is The BruteForce Approch(O(n^2))
{
    int largest=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
        largest=Math.max(largest,sum);
        if(sum<0)
        {
            sum=0;
        }
    }
    return largest;
}

}
