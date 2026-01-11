package CF_900;

import java.util.Scanner;

public class Jellyfish_and_Undertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long[] x  = new long[n];

            for(int i = 0; i<n; i++){
                x[i] = sc.nextLong();
            }
            long ans = 0;
            if(b>1){
                ans  = b-1;
                b = 1;
            }
            for(int i =  0;i<n;i++){
                 b = Math.min(x[i]+b, a);
                ans += b-1;
                b = 1;
            }
            ans++;
            System.out.println(ans);

        }
        sc.close();
    }
}
