import java.util.Scanner;

public class AllOccurences {
    public static int[] allOccurences(int[] arr, int i, int k, int fsf) {

        if (i == arr.length) {
            return new int[fsf];
        }

        if (arr[i] == k) {

            int[] aoac = allOccurences(arr, i + 1, k, fsf + 1);
            aoac[fsf] = i;
            return aoac;

        }
        return allOccurences(arr, i + 1, k, fsf);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        int key = s.nextInt();
        int[] ans = allOccurences(a, 0, key, 0);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        if (ans.length == 0) {
            System.out.println();
        }
    }

}
