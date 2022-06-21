import java.util.Scanner;

public class PrintStairsPath {
    public static void printStairsPath(int stn, String path) {
        if (stn == 0) {
            System.out.println(path);
            return;
        } else if (stn < 0) {
            return;
        }
        printStairsPath(stn - 1, path + "1");

        printStairsPath(stn - 2, path + "2");

        printStairsPath(stn - 3, path + "3");

        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printStairsPath(n, "");
    }
}
