package CF_800;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int  n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean flag = false;
            long diff = Long.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                diff = Math.min(diff, a[i]-a[i-1]);
                if(diff<0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(0);
            }
            else{
                long ans = diff/2;
                System.out.println(ans+1);
            }
        }
    }
}
