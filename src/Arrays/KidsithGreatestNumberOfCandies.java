package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));

    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int max=getMax(candies);
            if(candies[i]+extraCandies>=max)
            {
                list.add(true);

            }
            else {
                list.add(false);
            }
        }
        return list;
    }
    static int getMax(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
