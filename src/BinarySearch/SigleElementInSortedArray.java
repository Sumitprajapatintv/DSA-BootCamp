package BinarySearch;

public class SigleElementInSortedArray {
    public static void main(String[] args) {
        int [] nums={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
//    static public int singleNonDuplicate(int[] nums) {
//        for(int i=0;i<nums.length;i=i+2)
//        {
//            if(nums[i]!=nums[i+1])
//            {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
    static public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length];
        int start=1;
        int end=nums.length-2;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }
            if(mid%2==1 && nums[mid]==nums[mid-1] || mid %2==0 && nums[mid]==nums[mid+1])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;

    }
}
