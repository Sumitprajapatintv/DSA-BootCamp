package String;

public class SentenceSimilaritythird {
    public static  void main(String[] args)
    {
        String sentence1="My name is Haley";
        String sentence2="My Haley";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
    static public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1==sentence2){
            return true;
        }
        String[] str1=sentence1.split(" ");
        String[] str2=sentence2.split(" ");
        int len1=str1.length;
        int len2= str2.length;
        System.out.println(len1);
        System.out.println(len2);
      return true;
    }
}
