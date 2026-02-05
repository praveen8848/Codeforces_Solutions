

import java.util.Scanner;

public class Luke_is_a_Foodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] a = new long[n];
            long ans = 0;

            for(int i = 0; i<n; i++){
                a[i] = sc.nextLong();
            }
            long Min = a[0]-x;
            long Max = a[0]+x;

            for(int i = 1; i<n; i++){
                long cMin = a[i]-x;
                long cMax = a[i]+x;

                Min = Math.max(cMin, Min);
                Max = Math.min(Max, cMax);
                if(Min>Max){
                    ans++;
                    Min = cMin;
                    Max = cMax;
                }
            }
            System.out.println(ans);
        }
    }
}
