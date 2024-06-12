package Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int [] arr={2,7,9,3,1};
        System.out.println(rob(arr));
    }
    static public int rob(int[] nums) {
        int envSum=0;
        int oddSum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                envSum+=nums[i];
            }
            else {
                oddSum+=nums[i];
            }
        }
        return Math.max(envSum,oddSum);
    }
}
