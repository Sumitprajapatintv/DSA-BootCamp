package LinearSearch;
//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumerDigitInArray {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static public int findNumbers(int[] nums) {
        int countdigit=0;
        for(int i:nums)
        {
            int digit=countDigit(i);
            if(digit%2==0)
            {
                countdigit++;
            }
        }
        return countdigit;
    }
    static public int countDigit(int number)
    {
        int count=0;
        while(number>0)
        {
            int rem=number%10;
            count++;
            number=number/10;
        }
        return count;
    }
}
