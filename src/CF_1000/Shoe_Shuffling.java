import java.util.Scanner;

public class Shoe_Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                int[] p = new int[n];
                boolean possible = true;
                int l = 0;

                while (l < n) {
                    int r = l + 1;
                    while (r < n && a[r] == a[l]) {
                        r++;
                    }

                    if (r == l + 1) {
                        possible = false;
                        break;
                    }

                    for (int i = l; i < r - 1; i++) {
                        p[i] = i + 2;
                    }
                    p[r - 1] = l + 1;

                    l = r;
                }

                if (!possible) {
                    System.out.println("-1");
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < n; i++) {
                        sb.append(p[i]).append(" ");
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}