package Arrays;

import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    static public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr2=new int[index.length];
            for(int i=0;i<index.length;i++)
            {
                int num=nums[i];
                int ind=index[i];
                arr2[ind]=num;
            }
        return arr2;

    }
}
