

import java.util.Scanner;

public class Array_and_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();

                int[] pos = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    int val = scanner.nextInt();
                    pos[val] = i;
                }

                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }

                boolean possible = true;
                int lastIdx = pos[a[0]];

                for (int i = 1; i < n; i++) {
                    if (a[i] != a[i - 1]) {
                        int currentIdx = pos[a[i]];
                        if (currentIdx < lastIdx) {
                            possible = false;
                            break;
                        }
                        lastIdx = currentIdx;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }

    }
}
