import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombination {
    static String[] keyMap = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKpc(String str) {
        if (str.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(str);
            return res;
        }
        int key = str.charAt(0) - '0';
        ArrayList<String> kpc = getKpc(str.substring(1));
        ArrayList<String> res = new ArrayList<>();
        String nstr = keyMap[key];

        for (int i = 0; i < nstr.length(); i++) {
            for (int j = 0; j < kpc.size(); j++) {
                res.add(nstr.charAt(i) + kpc.get(j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(getKpc(str));
    }
}