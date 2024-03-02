package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="Sumit";
        char ch='k';
        System.out.println(SearchInString(name,ch));


    }
    static boolean SearchInString(String name,char ch)
    {
        if(name.length()==0)
        {
            return false;
        }
        for(char i:name.toCharArray())
        {
            if(i==ch)
            {
                return true;
            }
        }
        return false;
    }
}
