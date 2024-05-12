package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
       int [] arr={9,9,9,9,9,9,9,9,9};
       int k=1;
        System.out.println(addToArrayForm(arr,k));
    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while (i>=0 || k>0)
        {
            int numValue=0;
            if(i>=0)
            {
                numValue=num[i];
            }
            int d=k%10;
            int sum=numValue+d+carry;
            int digit=sum%10;
            carry=sum/10;
            ans.add(digit);
            i--;
            k=k/10;

        }
        if(carry>0)
        {
            ans.add(carry);
        }
        Collections.reverse(ans);

        return ans;
    }
}
