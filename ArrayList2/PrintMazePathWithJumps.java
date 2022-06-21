import java.util.Scanner;

public class PrintMazePathWithJumps {
    public static void printMazePathWithJumps(int sr, int sc, int dr, int dc, String path) {
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        for (int i = sc + 1; i <= dc; i++) {
            printMazePathWithJumps(sr, i, dr, dc, path + "h" + (i - sc));
        }
        for (int i = sr + 1; i <= dr; i++) {
            printMazePathWithJumps(i, sc, dr, dc, path + "v" + (i - sr));
        }
        int count = 0;
        for (int i = sr + 1, j = sc + 1; i <= dr && j <= dc; i++, j++) {
            count++;
            printMazePathWithJumps(i, j, dr, dc, path + "d" + count);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        rows = s.nextInt();
        columns = s.nextInt();
        printMazePathWithJumps(0, 0, rows - 1, columns - 1, "");
    }
}
