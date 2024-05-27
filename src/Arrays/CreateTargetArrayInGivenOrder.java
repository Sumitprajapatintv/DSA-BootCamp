package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    static public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans=new ArrayList<>();
        int[] arr2=new int[index.length];
            for(int i=0;i<nums.length;i++)
            {
                ans.add(index[i],nums[i]);
            }
        for(int i=0;i<nums.length;i++)
        {
            arr2[i]=ans.get(i);
        }

        return arr2;

    }
}
