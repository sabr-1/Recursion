import java.util.Scanner;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int i, int k) {
        if (i == arr.length) {
            return -1;
        }
        if (k == arr[i]) {
            return i;
        }
        return firstOccurence(arr, i + 1, k);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        int key = s.nextInt();
        System.out.println(firstOccurence(a, 0, key));
    }
}
