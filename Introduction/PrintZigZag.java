import java.util.Scanner;

public class PrintZigZag {
    public static void printZigZag(int n) {
        if (n != 0) {
            System.out.print(n + " ");
            printZigZag(n - 1);
            System.out.print(n + " ");
            printZigZag(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printZigZag(n);
    }
}
