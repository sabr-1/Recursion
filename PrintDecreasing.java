import java.util.Scanner;

public class PrintDecreasing {
    public static void printDecreasing(int n) {
        if (n != 0) {
            System.out.println(n);
            printDecreasing(n - 1);
        }
        return;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printDecreasing(n);
    }
}
