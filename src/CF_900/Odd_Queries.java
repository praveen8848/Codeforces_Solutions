package CF_900;

import java.util.Scanner;

public class Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n];
            long[][] qu = new long[q][3];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 3; j++) {
                    qu[i][j] = sc.nextLong();
                }
            }
            long[] p = new long[n];
            p[0] = a[0];
            for (int i = 1; i < n; i++) {
                p[i] = p[i-1]+a[i];
            }

            for(long[] que : qu){
                long l = que[0]-1;
                long r = que[1]-1;
                long k = que[2];
                long len = r-l+1;
                long s = len*k;
                long subsetSum = 0;
                if(l == 0){
                    subsetSum = p[(int) r];
                }
                else{
                    l = l-1;
                    subsetSum = p[(int)r]- p[(int) l];
                }
                long total = p[n-1];
                total = total-subsetSum;
                total = total + s;
                if(total%2 == 0){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }

        }
    }
}
