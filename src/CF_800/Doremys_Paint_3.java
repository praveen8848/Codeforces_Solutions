package CF_800;

import java.util.Scanner;

public class Doremys_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int d1 = a[0];
            int d2 = -1;
            int c1 = 1, c2 = 0;
            boolean valid = true;

            for (int i = 1; i < n; i++) {
                if (a[i] == d1) {
                    c1++;
                }
                else if (a[i] == d2) {
                    c2++;
                }
                else if (d2 == -1) {
                    d2 = a[i];
                    c2 = 1;
                }
                else {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                System.out.println("No");
                continue;
            }

            // Only one distinct value
            if (d2 == -1) {
                System.out.println("Yes");
                continue;
            }

            if (n % 2 == 0) {
                System.out.println(c1 == c2 ? "Yes" : "No");
            } else {
                System.out.println(Math.abs(c1 - c2) == 1 ? "Yes" : "No");
            }
        }
    }
}
