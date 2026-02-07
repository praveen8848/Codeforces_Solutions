import java.util.Scanner;

public class Roof_Construction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();

                // Find the largest power of 2 less than n
                // Example: if n=6 (110), k=4 (100)
                int k = Integer.highestOneBit(n - 1);

                StringBuilder sb = new StringBuilder();

                // Iterate from 1 to n-1
                for (int i = 1; i < n; i++) {
                    // Start the "Big Number" side with 0 to create the bridge (0, k)
                    if (i == k) {
                        sb.append("0 ").append(i).append(" ");
                    } else {
                        sb.append(i).append(" ");
                    }
                }

                System.out.println(sb);
            }
        }
    }
}