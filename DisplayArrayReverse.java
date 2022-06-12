import java.util.Scanner;

public class DisplayArrayReverse {
    public static void displayReverse(int[] arr, int i) {
        if (i < arr.length) {
            displayReverse(arr, i + 1);
            System.out.println(arr[i]);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        displayReverse(a, 0);
    }
}
