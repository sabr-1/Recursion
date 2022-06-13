import java.util.Scanner;

public class PowerLogarithmic {
    public static int power(int x, int n) {
        if (n != 0) {
            if (n % 2 == 0) {
                return power(x * x, n / 2);
            } else {
                return x * power(x * x, (n - 1) / 2);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x, n));
    }
}
