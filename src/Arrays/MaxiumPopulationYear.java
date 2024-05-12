package Arrays;

public class MaxiumPopulationYear {
    public static void main(String[] args) {
      int [][] arr={{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(arr));

    }

    static public int maximumPopulation(int[][] logs) {
            int [] arr2=new int[101];
            for(int item[]:logs)
            {
               int by=item[0];
               int dy=item[1];
               arr2[by-1950]++;
               arr2[dy-1950]--;
            }
            for (int i=1;i<arr2.length;i++)
            {
                arr2[i]+=arr2[i-1];
            }
            int max=Integer.MIN_VALUE;
            int eYear=Integer.MAX_VALUE;
            for (int i=0;i<arr2.length;i++)
            {
                if(arr2[i]>max)
                {
                    max=arr2[i];

                }
            }
            for (int i=0;i<arr2.length;i++)
            {
               if(arr2[i]==max)
               {
                   eYear=1950+i;
                   break;
               }
            }
            return eYear;
    }
}