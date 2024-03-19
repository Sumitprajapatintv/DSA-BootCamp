package BinarySearch;
////https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestCharacterGreaterThanTarget {
    public static void main(String[] args) {
       char [] arr={'x','x','y','y'};
       char target='z';
       int ans=smallestCharacter(arr,target);
        System.out.println(arr[ans]);

    }
    static int smallestCharacter(char[] arr,char target)
    {
        if(target>arr[arr.length-1])
        {
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end = mid - 1;
            } else  {
                start=mid+1;
            }
        }
        return start;

    }
}
/*
  public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
               int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;

            } else  {
                start=mid+1;
            }
        }
        return letters[start % letters.length];

    }
 */