import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void printDecreasingIncreasing(int n) {
        if (n != 0) {
            System.out.println(n);
            printDecreasingIncreasing(n - 1);
            System.out.println(n);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printDecreasingIncreasing(n);
    }
}
