package CF_900;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];

            for(int i = 0; i<n; i++){
                a[i] = sc.nextLong();
            }
            if(n == 1){
                System.out.println(0);
                continue;
            }
            Arrays.sort(a);
            long ans = Long.MIN_VALUE;
            long count = 1;
            for (int i = 1; i < n; i++) {
                if(a[i]-a[i-1]>k){
                    count = 1;
                }
                else {
                    count++;
                }
                ans = Math.max(ans, count);
            }
            System.out.println(n-ans);
        }
    }
}
