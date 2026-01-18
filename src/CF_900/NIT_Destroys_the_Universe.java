package CF_900;

import java.util.Scanner;

public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int ans = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(a[i] == 0){
                    if(count>0){
                        ans++;
                    }
                    count = 0;
                }
                else {
                    count++;
                }
            }
            if(count>0){
                ans++;
            }
            System.out.println(Math.min(ans, 2));
        }
    }
}
