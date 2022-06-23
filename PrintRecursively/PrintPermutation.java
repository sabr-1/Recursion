import java.util.Scanner;

public class PrintPermutation {
    public static void printPermutation(String s, String ans) {
        if (s.length() == 1) {
            System.out.println(ans + s);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            printPermutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printPermutation(str, "");
    }
}