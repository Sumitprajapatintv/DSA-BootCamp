package String;

import java.util.Scanner;

public class LengthOfLastWordInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s;
        System.out.println("Input string:");
        s=scan.nextLine();

        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
             String str=s.trim();
            int count=0;
            for(int i=str.length()-1;i>=0;i--)
            {
                if(str.charAt(i)!=' ')
                {
                    count++;
                }
                else {
                    break;
                }
            }

            return count;

    }
}
