package BinarySearch;

public class SqureRootOfANumber {
    public static void main(String[] args) {
        int num=13;
        System.out.println(mySqrt(num));

    }
    static public int mySqrt(int x) {
        int ans=-1;
        int start=0;
        int end=x;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int sqrt=mid*mid;
            if(sqrt==x)
            {
                return mid;
            }
            if(sqrt<=x)
            {
                start=mid+1;
                ans=mid;
            }
            else {
                end=mid-1;
            }
        }
        return ans;

    }
}
