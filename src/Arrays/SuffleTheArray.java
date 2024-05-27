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
    //This fucntion will take o(N) complexity both in space and time
    // Lets reduce this in O(1) space
//
    static public int[] shuffle(int[] nums, int n) {

        for(int i=0;i<n;i++)
        {
            nums[i+n]+=nums[i]*10000;
        }
        for(int i=0;i<n;i++)
        {
            nums[2*i]=nums[i+n]/10000;
            nums[2*i+1]=nums[i+n]%1000;
        }

        return nums;
    }
}
