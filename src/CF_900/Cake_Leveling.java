import java.util.Scanner;

public class Cake_Leveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            long sum = 0;
            long ans = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
                long div = sum / (i + 1);
                ans = Math.min(ans, div);
                arr[i] = ans;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}