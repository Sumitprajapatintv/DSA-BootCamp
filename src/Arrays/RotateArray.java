package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
    }
//    static public void rotate(int[] nums, int k) {
//
//        while (k!=0) {
//            int i=nums.length-1;
//            int j=nums.length-2;
//            while (j >= 0) {
//                swap(i, j, nums);
//                i--;
//                j--;
//            }
//            k--;
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//    static void swap(int l,int m,int[] nums)
//    {
//        int temp=nums[l];
//        nums[l]=nums[m];
//        nums[m]=temp;
//    }
   static public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       reverse(0,n-k-1,nums);
       reverse(n-k, n-1,nums);
       reverse(0,n-1,nums);
       System.out.println(Arrays.toString(nums));
   }
   static void reverse(int i,int j,int [] nums)
   {
       while(i<j)
       {
         swap(i,j,nums);
         i++;
         j--;
       }
   }
   static void swap(int l,int m,int []nums)
   {
       int temp=nums[l];
       nums[l]=nums[m];
       nums[m]=temp;
   }
}
