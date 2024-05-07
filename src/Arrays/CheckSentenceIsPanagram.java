package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckSentenceIsPanagram {
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    static public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
          set.add(sentence.charAt(i));
        }
        if(set.size()!=26)
        {
            return false;
        }
        return true;
    }
}
