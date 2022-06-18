import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJump {

    public static ArrayList<String> getMazePathWithJump(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> res = new ArrayList<>();

        for (int i = sc + 1; i <= dc; i++) {

            ArrayList<String> hans = getMazePathWithJump(sr, i, dr, dc);

            for (String s : hans) {
                res.add("h" + (i - sc) + s);
            }

        }
        for (int i = sr + 1; i <= dr; i++) {
            ArrayList<String> vans = getMazePathWithJump(i, sc, dr, dc);

            for (String s : vans) {
                res.add("v" + (i - sr) + s);
            }
        }
        int count = 1;
        for (int i = sr + 1, j = sc + 1; i <= dr && j <= dc; i++, j++) {
            ArrayList<String> dans = getMazePathWithJump(i, j, dr, dc);

            for (String s : dans) {
                res.add("d" + count + s);
            }
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        rows = s.nextInt();
        columns = s.nextInt();
        System.out.println(getMazePathWithJump(0, 0, rows - 1, columns - 1));

    }
}
