package Arrays;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr));

    }

    static int minJumps(int[] arr) {
        int count = 0;
       int step=0;
        for (int i = 0; i < arr.length;i=i+step) {
            step = arr[i] + i;
            count++;
            i=step;
            if(step> arr.length)
            {
                break;
            }


        }
        return count+1;
    }
}
