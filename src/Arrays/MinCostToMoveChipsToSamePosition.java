package Arrays;

public class MinCostToMoveChipsToSamePosition {
    public static void main(String[] args) {
        int [] position={1,2,3};
        System.out.println(minCostToMoveChips(position));
    }
    static public int minCostToMoveChips(int[] position) {
      int even=0,odd=0;
      for(int i=0;i<position.length;i++)
      {
          if(position[i]%2==0)
          {
              even++;
          }
          else {
              odd++;
          }
      }
      return Math.min(even,odd);


    }

}
