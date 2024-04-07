package SearchingAndSorting;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int [] arr={7,8,9,11,12};
        System.out.println(missingPositive(arr));
    }
    static int missingPositive(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex=arr[i]-1;
              if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!=k+1)
            {
                return k+1;
            }
        }
        return arr.length+1;
    }
    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
