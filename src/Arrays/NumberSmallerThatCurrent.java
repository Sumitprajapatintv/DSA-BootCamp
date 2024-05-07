package Arrays;

import java.util.Arrays;

public class NumberSmallerThatCurrent {
    public static void main(String[] args) {
       int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr2=new int[nums.length];
            int k=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    count++;
                }
            }
            arr2[k++]=count;

        }
        return  arr2;

    }
}
