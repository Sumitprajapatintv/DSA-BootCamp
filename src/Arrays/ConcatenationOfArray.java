/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.


 */

package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int [] getConcatenation(int[] arr)
    {
        int len=2*arr.length;
        int[] arr2=new int[len];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
            arr2[i+arr.length]=arr[i];
        }
        return arr2;
    }
}
