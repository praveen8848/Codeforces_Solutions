import java.util.Scanner;
import java.util.ArrayList;

public class Fashionable_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[101];

            for (int i = 0; i < n; i++) {
                count[sc.nextInt()]++;
            }

            ArrayList<Integer> result = new ArrayList<>();
            while (true) {
                boolean found = false;
                for (int i = 100; i >= 1; i--) {
                    if (count[i] > 0) {
                        result.add(i);
                        count[i]--;
                        found = true;
                    }
                }
                if (!found) break;
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
            }
            System.out.println();
        }

        sc.close();
    }
}