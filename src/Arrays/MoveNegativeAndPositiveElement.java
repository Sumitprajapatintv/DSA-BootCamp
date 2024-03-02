package Arrays;

public class MoveNegativeAndPositiveElement {
    public static void main(String[] args) {
        //Move all negative numbers to beginning and positive to end with constant extra spacess
      int[] Arr={-12, 11, -13, -5, 6, -7, 5, -3, -6,2,8,-9,-7,85,96,-77,65};
      int i=0;
      int j=Arr.length-1;
      while(i<j)
      {
          if(Arr[i]<0)
          {
              i++;
          }
          if(Arr[j]>0)
          {
              j--;
          }
          int temp=0;
          temp=Arr[i];
          Arr[i]=Arr[j];
          Arr[j]=temp;
      }
      for(int k=0;k< Arr.length;k++)
      {
          System.out.print(Arr[k]+" ");
      }

    }
    static void swap(int a,int b)
    {

    }
}
