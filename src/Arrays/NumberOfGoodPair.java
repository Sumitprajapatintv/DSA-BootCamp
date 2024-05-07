package Arrays;
/*

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPair {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        System.out.println(numIdenticalPairs(arr));

    }
    static public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
