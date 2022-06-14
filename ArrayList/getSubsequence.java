import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    public static ArrayList<String> getSubsequence(String str) {
        if (str.isEmpty()) {
            ArrayList<String> sS = new ArrayList<>();
            sS.add(str);
            return sS;
        }
        ArrayList<String> sS = getSubsequence(str.substring(1));
        int size = sS.size();
        for (int i = 0; i < size; i++) {
            sS.add(str.charAt(0) + sS.get(i));
        }
        return sS;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();
        System.out.println(getSubsequence(str));

    }
}