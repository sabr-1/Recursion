import java.util.Scanner;

public class PrintKeypadCombination {
    static String[] keyMap = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypadCombination(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int key = s.charAt(0) - '0';
        for (int i = 0; i < keyMap[key].length(); i++) {
            printKeypadCombination(s.substring(1), ans + keyMap[key].charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printKeypadCombination(str, "");

    }
}
