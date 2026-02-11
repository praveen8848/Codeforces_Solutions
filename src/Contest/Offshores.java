

import java.util.Scanner;

public class Offshores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] a = new long[n];
            long sumTransferred = 0;

            // Read input and calculate the total transferable sum simultaneously
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                // Calculate contribution: how much this bank gives if it sends money
                long contribution = (a[i] / x) * y;
                sumTransferred += contribution;
            }

            long maxMoney = 0;

            // Check each bank as the potential "receiver"
            for (int i = 0; i < n; i++) {
                long currentContribution = (a[i] / x) * y;

                // The formula: Total Sum of all transfers
                // - minus what this specific bank would have sent (since it's now keeping it)
                // + plus the full original amount of this bank
                long totalForThisTarget = sumTransferred - currentContribution + a[i];

                if (totalForThisTarget > maxMoney) {
                    maxMoney = totalForThisTarget;
                }
            }

            System.out.println(maxMoney);
    }
}
