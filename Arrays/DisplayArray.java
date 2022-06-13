import java.util.Scanner;

public class DisplayArray {
    public static void display(int[] arr, int i) {
        if (i < arr.length) {

            System.out.println(arr[i]);
            display(arr, i + 1);
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
        display(a, 0);
    }
}