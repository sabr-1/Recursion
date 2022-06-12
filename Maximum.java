import java.util.Scanner;

public class Maximum {

    public static int max(int[] arr, int i) {

        if (i == arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxi = max(arr, i + 1);
        if (arr[i] > maxi) {
            maxi = arr[i];
        }
        return maxi;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(max(a, 0));
    }
}
