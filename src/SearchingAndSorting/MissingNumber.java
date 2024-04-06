package SearchingAndSorting;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={0,1};
        System.out.println(sortCyclic(arr));

    }
    public static int sortCyclic(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            if(l!=arr[l])
            {
                return l;
            }
        }
        return -1;

    }
    public static void swap(int [] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
