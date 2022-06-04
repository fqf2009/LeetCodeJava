package LeetCodeProblems;

import static java.lang.Math.abs;

public class LC1275_FindWinnerOnTicTacToe {
    public String tictactoe(int[][] moves) {
        int delta = 1;
        int[] rsum = new int[3];
        int[] csum = new int[3];
        int diag = 0, adiag = 0;
        for (int[] move : moves) {
            int r = move[0], c = move[1];
            rsum[r] += delta;
            csum[c] += delta;
            if (r == c) diag += delta;
            if (r + c == 2) adiag += delta;
            if (abs(rsum[r]) == 3 || abs(csum[c]) == 3 || abs(diag) == 3 || abs(adiag) == 3)
                return delta == 1 ? "A" : "B";
            delta *= -1;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
