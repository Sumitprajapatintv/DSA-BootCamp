package Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    //This fucntion will take the complexity of n^2 and space n
    //So we can optimize this problem in o(n)
    //How-using the prefix sum
//    static public int[] runningSum(int[] nums) {
//          int[] arr2=new int[nums.length];
//          for(int i=0;i< nums.length;i++)
//          {
//              int sum=0;
//              for(int j=0;j<=i;j++)
//              {
//                  sum+=nums[j];
//              }
//
//              arr2[i]=sum;
//          }
//    return arr2;
//    }
//    This is o(n) Solution and space is o(n)
    static public int[] runningSum(int[] nums) {
        int[] arr2=new int[nums.length];
        arr2[0]=nums[0];
        for(int i=1;i< nums.length;i++)
        {
           arr2[i]=arr2[i-1]+nums[i];
        }
        return arr2;
    }
}
