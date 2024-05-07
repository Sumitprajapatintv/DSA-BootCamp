package Arrays;

import java.util.Arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].


 */
public class SuffleTheArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));

    }
    static public int[] shuffle(int[] nums, int n) {
         int[] arr2=new int[2*n];
         int index=0;
         for(int i=0;i<n;i++)
         {
             arr2[index] = nums[i];
             arr2[index+1]=nums[i+n];
             index+=2;
         }

         return arr2;
    }
}
