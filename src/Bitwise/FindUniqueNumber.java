package Bitwise;

public class FindUniqueNumber {
    public static void main(String[] args)
    {
        int[] arr={3,4,2,4,2,6,3};
        System.out.println(answer(arr));
    }
    static public int answer(int[] arr)
    {
      int unique=0;
      for(int n:arr)
      {
          unique=unique^n;
      }
      return unique;
    }
}
