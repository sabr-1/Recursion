import java.util.Scanner;

public class PrintIncreasing {
    public static void printIncreasing(int n) {
        if (n != 0) {
            printIncreasing(n - 1);

            System.out.println(n);
        }

        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printIncreasing(n);
    }
}
