package CF_900;

import java.util.Scanner;

public class Luntik_and_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long s = 0;
            long count1 = 0;
            long count0 = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                s+=a;
                if(a == 1)count1++;
                if(a == 0)count0++;
            }
            long target  =  s-1;
            long ans = 0;

            if(target == 0){
                ans++;
                ans += (long)Math.pow(2,count0)-1;
            }
            else if(target>0){
                ans = count1;
                ans += count1 * ((long)Math.pow(2,count0)-1);
            }
            System.out.println(ans);

        }
    }
}
