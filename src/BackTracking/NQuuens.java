package BackTracking;

public class NQuuens {
    public static void main(String[] args) {
        queens()

    }
    static int queens(boolean[][] board , int r ){
        if(r == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        // plasing the queen and chacking
        for(int c = 0 ; c< board.length;c++){
            // place the queen if it is safe
            if(isSafe(board, r, c)){
                board[r][c] = true;
                count += queens(board,r+1);
                board[r][c] = false;
            }
        }
        return count;
    }
    public static boolean isSafe(boolean[][] board , int row , int col){
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }

            // diagonal left
            // minimum of row and col
            int maxLeft = Math.min(row,col);
            for (int j = 1; j <= maxLeft; j++) {
                if(board[row-i][col-i]){
                    return false;
                }
            }
            // diagonal right
            int maxRight = Math.min(row, board.length - col - 1);
            for (int j = 1; j <= maxRight; j++) {
                if(board[row-i][col+i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element == true){
                    System.out.println("Q");
                }
                else{
                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }
}
