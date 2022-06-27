import java.util.Scanner;

public class KnightTour {
    public static void displayBoard(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        return;
    }

    public static boolean isTourComplete(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void knightTour(int[][] board, int incomingMove, int sr, int sc) {
        if ((sr >= 0 && sr < board.length) && (sc >= 0 && sc < board[0].length) && board[sr][sc] == 0) {
            board[sr][sc] = incomingMove;

            knightTour(board, incomingMove + 1, sr - 2, sc + 1);
            knightTour(board, incomingMove + 1, sr - 1, sc + 2);
            knightTour(board, incomingMove + 1, sr + 1, sc + 2);
            knightTour(board, incomingMove + 1, sr + 2, sc + 1);
            knightTour(board, incomingMove + 1, sr + 2, sc - 1);
            knightTour(board, incomingMove + 1, sr + 1, sc - 2);
            knightTour(board, incomingMove + 1, sr - 1, sc - 2);
            knightTour(board, incomingMove + 1, sr - 2, sc - 1);
            if (incomingMove == board.length * board.length) {
                displayBoard(board);

            }
            board[sr][sc] = 0;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sr = s.nextInt();
        int sc = s.nextInt();
        int[][] board = new int[n][n];
        knightTour(board, 1, sr, sc);
        return;
    }
}
