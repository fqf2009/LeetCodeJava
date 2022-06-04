package LeetCodeProblems;

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
public class LC0348_DesignTicTacToe {
    private final int boardSize;
    private final int[] colSum;
    private final int[] rowSum;
    private int diagSum, antiDiagSum;

    public LC0348_DesignTicTacToe(int n) {
        boardSize = n;
        colSum = new int[n];
        rowSum = new int[n];
        diagSum = antiDiagSum = 0;
    }

    public int move(int row, int col, int player) {
        int delta = player == 1 ? 1 : -1;
        rowSum[row] += delta;
        colSum[col] += delta;
        if (row == col) diagSum += delta;
        if (row + col == boardSize - 1) antiDiagSum += delta;
        if (Math.abs(rowSum[row]) == boardSize || Math.abs(colSum[col]) == boardSize ||
                Math.abs(diagSum) == boardSize || Math.abs(antiDiagSum) == boardSize)
            return player;
        return 0;
    }
}
