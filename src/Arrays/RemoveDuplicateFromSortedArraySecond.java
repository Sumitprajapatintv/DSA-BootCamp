package Arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArraySecond {
    public static void  main(String[] args)
    {
         int[] arr={0,0,1,1,1,1,2,3,3};
         System.out.println(removeDuplicates(arr));
    }
    static public int removeDuplicates(int[] nums) {
            int k=0;
            for(int num:nums)
            {
                if(k<2 || num!=nums[k-2])
                {
                    nums[k++]=num;
                }

            }
            return k;
        }
}
