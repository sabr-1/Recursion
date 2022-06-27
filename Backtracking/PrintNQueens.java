import java.util.Scanner;

public class PrintNQueens {
    public static boolean isSafe(int[][] board, int ridx, int cidx) {
        for (int i = 0; i < ridx; i++) {
            if (board[i][cidx] == 1) {
                return false;
            }
        }
        for (int k = ridx - 1, j = cidx - 1; k >= 0 && j >= 0; k--, j--) {
            if (board[k][j] == 1) {
                return false;
            }
        }
        for (int k = ridx - 1, j = cidx + 1; k >= 0 && j < board[0].length; k--, j++) {
            if (board[k][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printNQueens(int[][] board, String ans, int ridx) {
        if (ridx == board.length) {
            System.out.println(ans + ".");
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, ridx, i)) {
                board[ridx][i] = 1;
                printNQueens(board, ans + ridx + "-" + i + ", ", ridx + 1);
                board[ridx][i] = 0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] board = new int[n][n];
        printNQueens(board, "", 0);
        return;
    }
}
