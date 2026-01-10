package CF_800;

import java.util.Scanner;

public class Forbidden_Integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            // Case 1: x != 1 → always possible using 1s
            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("1 ");
                }
                System.out.println();
                continue;
            }

            // Case 2: x == 1
            if (k == 1 || (k == 2 && n % 2 == 1)) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            // Use 2s and possibly one 3
            if (n % 2 == 0) {
                System.out.println(n / 2);
                for (int i = 0; i < n / 2; i++) {
                    System.out.print("2 ");
                }
            } else {
                System.out.println((n - 3) / 2 + 1);
                for (int i = 0; i < (n - 3) / 2; i++) {
                    System.out.print("2 ");
                }
                System.out.print("3");
            }
            System.out.println();
        }

        sc.close();
    }
}
