package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={3,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    static public int[] twoSum(int[] nums, int target) {
        int[] arr2=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr2[0]=i;
                    arr2[1]=j;
                }
            }
        }
        return arr2;
    }
}
