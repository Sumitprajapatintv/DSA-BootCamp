package Arrays;

import java.util.Arrays;

public class BuildArrayFromPermuation {
    public static void main(String[] args) {
        int [] arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));

    }
    static int[]  buildArray(int[] arr)
    {
        int arr2[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[arr[i]];
        }
        return arr2;
    }
}
