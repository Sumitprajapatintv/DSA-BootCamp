package Arrays;

public class CyclicRotateArrayByOne {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5};
        rotate(arr,arr.length);
         for(int i:arr)
         {
             System.out.print(i+" ");
         }

    }
    static public void rotate(int[] arr, int n)
    {
        int lastElement=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=lastElement;

    }
}
