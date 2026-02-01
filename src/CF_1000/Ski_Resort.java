

import java.util.Scanner;

public class Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            long q = sc.nextLong();

            long count = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if(x<=q){
                    count++;
                }
                else{
                    ans += combination(count , k);
                    count = 0;
                }
            }
            ans+= combination(count, k);
            System.out.println(ans);
        }
    }
    public static long combination(long n, long r){
        if(r>n)return 0;

        long ans = (n-r+1)*(n-r+2)/2;
        return ans;
    }
}
