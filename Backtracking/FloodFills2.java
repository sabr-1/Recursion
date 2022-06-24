import java.util.Scanner;

public class FloodFills2 {
    public static void floodFills2(int[][] m, int sr, int sc, String ans, boolean[][] track) {
        if (sr < 0 || sc < 0 || sr == m.length || sc == m[0].length || m[sr][sc] == 1 || track[sr][sc] == true) {
            return;
        } else if (sr == m.length - 1 && sc == m[0].length - 1) {
            System.out.println(ans);
            return;
        }
        track[sr][sc] = true;
        floodFills2(m, sr - 1, sc, ans + "t", track);
        floodFills2(m, sr, sc - 1, ans + "l", track);
        floodFills2(m, sr + 1, sc, ans + "d", track);
        floodFills2(m, sr, sc + 1, ans + "r", track);
        track[sr][sc] = false;
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
        boolean[][] track = new boolean[rows][columns];
        floodFills2(matrix, 0, 0, "", track);
        return;
    }
}
