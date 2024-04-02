package String;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        char [] str={'h','e','l','l','o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));

    }
    static void reverseString(char[] s) {

        int i=0;
        int j=s.length-1;
        while (i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

    }
}
