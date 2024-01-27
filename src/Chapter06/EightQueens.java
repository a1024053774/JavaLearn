package Chapter06;

public class EightQueens {
    public static void main(String[] args) {

        Queen8 queen8 = new Queen8();
        queen8.placeQueens(0);

    }
}

class Queen8{
    int[] board = new int[8];
    public void placeQueens(int row){
        if (row == 8) {
            printSolution();
            return;
        }
        for(int column = 0;column < 8;column++){
            if (isSafe(row,column)) {
                board[row] = column;
                placeQueens(row + 1);
            }
        }
    }

    private boolean isSafe(int row, int column) {
        for(int i = 0;i < row;i++){
            if (board[i] == column || (row - i) == Math.abs(column - board[i])) {
                return false;
            }
        }
        return true;
    }

    private void printSolution(){
        for(int row = 0;row < 8;row++){
            for(int column = 0;column < 8;column++){
                if (board[row] == column) {
                    System.out.print("Q");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
