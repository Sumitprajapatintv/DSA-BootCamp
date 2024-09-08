package String;
import java.util.*;
public class ExcelSheet {
    public static void main(String[] args)
    {
        int col=30;
        System.out.println(convertToTitle(col));
    }
    static public String convertToTitle(int columnNumber) {
         StringBuilder s=new StringBuilder();
         System.out.println((char)(2+'A'));

        while(columnNumber>0)
        {
             int rem=(columnNumber-1)%26;
             s.append((char)(rem+'A'));
            columnNumber=((columnNumber-1)/26);

        }
        return s.reverse().toString();
    }
}
