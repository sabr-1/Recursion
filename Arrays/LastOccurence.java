import java.util.Scanner;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int i, int k) {
        if (i == arr.length) {
            return -1;
        }
        int lisa = lastOccurence(arr, i + 1, k);
        if (lisa == -1 && arr[i] == k) {
            return i;
        }
        return lisa;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        int key = s.nextInt();
        System.out.println(lastOccurence(a, 0, key));
    }
}