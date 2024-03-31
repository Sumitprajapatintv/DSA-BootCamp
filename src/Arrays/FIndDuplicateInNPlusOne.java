package Arrays;

public class FIndDuplicateInNPlusOne {
    public static void main(String[] args) {
        int [] arr={3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return nums[i];
                }
            }
        }
        return  -1;
    }

}
