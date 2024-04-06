package SearchingAndSorting;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int [] arr={3,3,3,3,3};
        System.out.println(dupicate(arr));

    }
    public static int dupicate(int [] arr)
    {
        int i=0;

        while(i< arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!=k+1)
            {
                return arr[k];
            }
        }
        return -1;
    }
    public static void swap(int [] arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
