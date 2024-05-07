package Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static public int[] runningSum(int[] nums) {
          int[] arr2=new int[nums.length];
          for(int i=0;i< nums.length;i++)
          {
              int sum=0;
              for(int j=0;j<=i;j++)
              {
                  sum+=nums[j];
              }
              arr2[i]=sum;
          }
    return arr2;
    }
}
