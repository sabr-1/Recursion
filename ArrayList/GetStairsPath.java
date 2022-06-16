import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {

    public static ArrayList<String> getStairPath(int stn) {
        if (stn == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        } else if (stn < 0) {
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans1 = getStairPath(stn - 1);
        ArrayList<String> ans2 = getStairPath(stn - 2);
        ArrayList<String> ans3 = getStairPath(stn - 3);
        for (String s : ans1) {
            ans.add("1" + s);
        }
        for (String s : ans2) {
            ans.add("2" + s);
        }
        for (String s : ans3) {
            ans.add("3" + s);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(getStairPath(n));

    }
}
