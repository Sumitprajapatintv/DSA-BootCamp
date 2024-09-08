package String;
import java.util.*;

public class FindOccurenceOfFirstString {
    public static void main(String[] args)
    {
        String str="sadbutsad";
        String str2="sad";
        System.out.println(strStr(str,str2));

    }
    static public int strStr(String haystack, String needle) {
        int sizen=needle.length();
//        System.out.println(haystack.length());
//        System.out.println(haystack.substring(1,));
        for(int i=0;i<haystack.length()-sizen+1;i++)
        {
            if(haystack.substring(i,i+sizen).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
