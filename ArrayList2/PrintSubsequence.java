import java.util.Scanner;

public class PrintSubsequence {
    public static void printSubsequence(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        String nans = ans + s.charAt(0);
        printSubsequence(s.substring(1), nans);
        printSubsequence(s.substring(1), ans);
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        printSubsequence(str, "");
    }
}
