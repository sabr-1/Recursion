import java.util.Scanner;

public class TargetSum {

    public static void targetSum(int[] arr, int idx, int target, String set, int sum) {

        if (idx == arr.length) {
            if (sum == target) {
                System.out.println(set + ".");

            }
            return;
        }

        targetSum(arr, idx + 1, target, set + arr[idx] + ", ", sum + arr[idx]);

        targetSum(arr, idx + 1, target, set, sum);

        return;
    }

    public static void main(String[] args) {
        int size;

        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        targetSum(arr, 0, target, "", 0);
        return;

    }
}
