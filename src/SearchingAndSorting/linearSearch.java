package SearchingAndSorting;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={4,5,3,5,-4,38,43,22,3,-5};
        int target=43;
        System.out.println(LiearSearch(arr,target));

    }
    static int LiearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
