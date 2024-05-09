package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemMatchingTheRule {
    public static void main(String[] args) {
        List<List<String>>  items=new ArrayList<>();
        List<String> item1=new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        List<String> item2=new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        List<String> item3=new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        System.out.println(countMatches(items, "type","phone"));

    }
    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rowLength=items.size();
        int count =0;
        int col=0;
        if(ruleKey.equals("type"))
        {
            col=0;
        }
        if(ruleKey.equals("color"))
        {
            col=1;
        }
        if(ruleKey.equals("name"))
        {
            col=2;
        }
        for(int row=0;row<rowLength;row++)
        {
            if(items.get(row).get(col).equals(ruleValue))
            {
                count++;
            }
        }
        return  count;
    }
}
