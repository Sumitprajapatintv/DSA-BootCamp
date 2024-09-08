package String;

public class LongPressedName {
    public static void main(String[] args){
        String name="saeed";
        String typed="ssaaedd";
        System.out.println(isLongPressedName(name,typed));

    }
    static public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(i<name.length())
        {
           if(name.charAt(i)==typed.charAt(j))
           {
               i++;
               j++;
           }
           else if(i>0 && name.charAt(i-1)==typed.charAt(j)) {
               j++;
           }
           else {
                   break;
           }

        }
        return i==name.length() && j==typed.length() ;
    }
}
