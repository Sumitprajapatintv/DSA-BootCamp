package Arrays;
import java.util.*;

public class intersectionoftwoArray {
    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[] num2={2,2};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static public int[] intersection(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer> mySet = new HashSet<Integer>();
        for(int a:nums1)
        {
            mySet.add(a);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(mySet.contains(nums2[i]))
            {
                ans.add(nums2[i]);
                mySet.remove(nums2[i]);
            }
        }
        int[] arr=new int[ans.size()];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]= ans.get(k);
        }
        return arr;
    }
}
