import java.util.Scanner;

public class TowerOfHanoi {
    static int curr = 1;

    public static void toh(int n, int a, int b, int c) {
        if (n == 0) {
            return;
        }
        toh(n - 1, a, c, b);
        System.out.printf("%d[%d -> %d]\n", n, a, b);
        toh(n - 1, c, b, a);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        toh(n, n1, n2, n3);
    }
}