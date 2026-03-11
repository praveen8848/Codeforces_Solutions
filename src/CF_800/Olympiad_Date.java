

import java.util.HashMap;
import java.util.Scanner;

public class Olympiad_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] req = new int[10];
            req[0] = 3;
            req[1] = 1;
            req[2] = 2;
            req[3] = 1;
            req[5] = 1;

            int needed = 8;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= 0 && a <= 9 && req[a] > 0) {
                    req[a]--;
                    needed--;
                    if (needed == 0 && ans == 0) {
                        ans = i + 1;
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
