package CF_900;

import java.util.HashMap;
import java.util.Scanner;

public class Array_Cloning_Technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            HashMap<Long, Long> mp = new HashMap<>();
            for(long l : a){
                mp.put(l, mp.getOrDefault(l ,0L)+1);
            }
            long maxx = Long.MIN_VALUE;
            for( Long v : mp.values()){
                if(v>maxx){
                    maxx = v;
                }
            }
            long r = (n - maxx);
            long op = 0;
            long k = 1;
            while(r>0){
                op++;
                long swap = k*maxx;
                if(r>=swap){
                    r-=swap;
                    op+=swap;
                }
                else {
                    op+=r;
                    r = 0;
                }
                if(k == 1){
                    k++;
                }
                else {
                    k = 2*k;
                }
            }

            System.out.println(op);
        }
    }
}
