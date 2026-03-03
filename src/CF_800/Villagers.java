

import java.util.Arrays;
import java.util.Scanner;

public class Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] g = new long[n];
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    g[i] = sc.nextLong();
                    sum += g[i];
                }
                Arrays.sort(g);
                System.out.println(sum - g[n - 2]);
            }
        sc.close();
    }
}
