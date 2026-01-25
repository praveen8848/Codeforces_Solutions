package CF_900;

import java.util.Scanner;

public class Sum_Of_Medians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long total = n*k;

            long[] a = new long[n*k];
            for (int i = 0; i < total; i++) {
                a[i] = sc.nextLong();
            }

            int m = (n+1)/2;
            long step = n-m+1;
            long ans = 0;
            long currentStep = total;
            for (int i = 0; i < k; i++) {
                currentStep -= step;
                ans += a[(int)currentStep];
            }
            System.out.println(ans);
        }
    }
}
