import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sc == dc && sr == dr) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> hans = new ArrayList<>();
        ArrayList<String> vans = new ArrayList<>();
        if (sc < dc) {
            hans = getMazePath(sr, sc + 1, dr, dc);

        }
        if (sr < dr) {
            vans = getMazePath(sr + 1, sc, dr, dc);

        }

        ArrayList<String> res = new ArrayList<>();
        for (String s : hans) {
            res.add('h' + s);
        }
        for (String s : vans) {
            res.add('v' + s);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        rows = s.nextInt();
        columns = s.nextInt();
        System.out.println(getMazePath(0, 0, rows - 1, columns - 1));

    }
}
