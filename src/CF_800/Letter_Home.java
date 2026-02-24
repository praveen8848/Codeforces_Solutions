

import java.util.Scanner;

public class Letter_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();

            int first = 0;
            int last = 0;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (i == 0) first = x;
                if (i == n - 1) last = x;
            }

            int distanceToFirstThenLast = Math.abs(s - first) + (last - first);
            int distanceToLastThenFirst = Math.abs(s - last) + (last - first);

            System.out.println(Math.min(distanceToFirstThenLast, distanceToLastThenFirst));
        }
        scanner.close();
    }
}
