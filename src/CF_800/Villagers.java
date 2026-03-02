

import java.util.Arrays;
import java.util.Scanner;

public class Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] g = new long[n];
                for (int i = 0; i < n; i++) {
                    g[i] = sc.nextLong();
                }
                Arrays.sort(g);
                long ans = g[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    ans += g[i];
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
