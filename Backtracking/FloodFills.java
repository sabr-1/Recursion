import java.util.Scanner;

public class FloodFills {
    public static void floodFills(int[][] m, int sr, int sc, String ans) {
        if (sr == m.length - 1 && sc == m[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (sr > 0 && m[sr - 1][sc] != 1) {
            m[sr - 1][sc] = 1;
            floodFills(m, sr - 1, sc, ans + "t");
            m[sr - 1][sc] = 0;
        }
        if (sc > 0 && m[sr][sc - 1] != 1) {
            m[sr][sc - 1] = 1;
            floodFills(m, sr, sc - 1, ans + "l");
            m[sr][sc - 1] = 0;
        }
        if (sr < m.length - 1 && m[sr + 1][sc] != 1) {
            m[sr + 1][sc] = 1;
            floodFills(m, sr + 1, sc, ans + "d");
            m[sr + 1][sc] = 0;
        }
        if (sc < m[0].length - 1 && m[sr][sc + 1] != 1) {
            m[sr][sc + 1] = 1;
            floodFills(m, sr, sc + 1, ans + "r");
            m[sr][sc + 1] = 0;
        }
        return;
    }

    public static void main(String[] args) {
        int rows, columns;
        Scanner s = new Scanner(System.in);
        rows = s.nextInt();
        columns = s.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        floodFills(matrix, 0, 0, "");
        return;
    }
}