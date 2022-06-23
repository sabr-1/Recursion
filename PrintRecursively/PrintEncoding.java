import java.util.Scanner;

public class PrintEncoding {
    public static int strToInt(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += (s.charAt(i) - '0') * (Math.pow(10, s.length() - 1 - i));
        }
        return ans;
    }

    public static void printEncoding(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        else if (s.length() == 1) {
            if (s.charAt(0) == '0') {
                return;
            }
            System.out.println(ans + (char) ('a' + ((s.charAt(0) - '0') - 1)));
            return;
        }
        if (s.charAt(0) == '0') {
            return;
        }
        printEncoding(s.substring(1), ans + (char) ('a' + ((s.charAt(0) - '0') - 1)));
        if (strToInt(s.substring(0, 2)) < 27) {
            printEncoding(s.substring(2), ans + (char) ('a' + (strToInt(s.substring(0,
                    2)) - 1)));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printEncoding(str, "");
        return;
    }
}