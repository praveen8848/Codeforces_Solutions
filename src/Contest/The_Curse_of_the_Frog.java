

import java.util.Scanner;

public class The_Curse_of_the_Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long x = sc.nextLong();
                long s = 0;
                long m = 0;
                for (int i = 0; i < n; i++) {
                    long a = sc.nextLong();
                    long b = sc.nextLong();
                    long c = sc.nextLong();
                    s += a * (b - 1);
                    long g = a * b - c;
                    if (g > m) m = g;
                }
                if (s >= x) {
                    System.out.println(0);
                } else if (m <= 0) {
                    System.out.println(-1);
                } else {
                    long req = x - s;
                    System.out.println((req + m - 1) / m);
                }
            }
        }
    }
}
