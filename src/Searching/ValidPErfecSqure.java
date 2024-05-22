package Searching;

public class ValidPErfecSqure {
    public static void main(String[] args) {
        int num=1;
        System.out.println(isPerfectSquare(num));
    }
    static public boolean isPerfectSquare(int num) {
          int start=1;
          int end=num/2;
          if(num==1)
          {
              return true;
          }
          while (start<=end)
          {
              int mid=start+(end-start)/2;
              long sq=(long)mid*mid;
              if(sq==num)
              {
                  return true;
              } else if (sq>num) {
                  end=mid-1;
              }else {
                  start=mid+1;
              }
          }
          return false;
    }
}
