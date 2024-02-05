import java.lang.reflect.Array;
import java.util.Arrays;

class Pair{
    public int min;
    public int max;
}
public class MaxMin {
    static Pair minmax(int[] arr,int length){
        Pair minmax=new Pair();
        Arrays.sort(arr);
        minmax.min=arr[0];
        minmax.max=arr[length-1];
        return minmax;

    }
    public static void main(String[] args) {
        int[] arr={12,1,5,1,9,6,25,254,15,152};
        int lenght= arr.length;
        Pair minmax = minmax(arr, lenght);
        System.out.println("min ele is "+minmax.min);
        System.out.println("max ele is "+minmax.max);

    }
}
