import java.util.Scanner;

public class PrintMazePath {
    public static void printMazePath(int sr, int sc, int dr, int dc, String path) {
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        if (sc < dc) {
            printMazePath(sr, sc + 1, dr, dc, path + "h");
        }
        if (sr < dr) {
            printMazePath(sr + 1, sc, dr, dc, path + "v");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        rows = s.nextInt();
        columns = s.nextInt();
        printMazePath(0, 0, rows - 1, columns - 1, "");
    }
}
