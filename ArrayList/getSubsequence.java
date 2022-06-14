import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {

    public static ArrayList<String> getSs(String str) {
        if (str.isEmpty()) {
            ArrayList<String> sS = new ArrayList<>();
            sS.add(str);
            return sS;
        }
        ArrayList<String> sS = getSs(str.substring(1));

        int size = sS.size();
        for (int i = 0; i < size; i++) {

            sS.add(str.substring(0, 1) + sS.get(i));
        }
        return sS;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();

        System.out.println(getSs(str));

    }
}
