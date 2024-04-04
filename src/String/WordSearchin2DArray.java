package String;

public class WordSearchin2DArray {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'F','S','C','S'},{'A','D','E','E'}};
        String str="ABCCED";
        System.out.println(exist(board,str));
    }
    public static boolean exist(char[][] board, String word) {
//        int row = board.length;
//        int col = board[0].length;
        int row=0;
        int col=0;
        for(int k=0;k<word.length();k++)
        {
           if(word.charAt(k)==board[row][col])
           {
               col++;
           }
           else if (word.charAt(k)!=board[row][col]){


                   if(word.charAt(k)!=board[row][col++] || word.charAt(k)!=board[row][col--] ||word.charAt(k)!=board[row++][col]  || word.charAt(k)!=board[row--][col] )
                   {
                       return false;
                   }

           }

        }
return true;

    }
}
