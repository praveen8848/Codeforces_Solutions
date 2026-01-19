package CF_900;

import java.util.Scanner;

public class Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int count = 0;
            boolean flag  = false;
            for (int i = n-1; i >=0 ; i--) {
                if(i == n-1)continue;
                if(a[i+1] == 0){
                    flag = true;
                    break;
                }
                while (a[i]>=a[i+1]){
                    long h = a[i]/2;
                    a[i] = h;
                    count++;
                }
            }
            if (flag){
                System.out.println(-1);
            }
            else{
                System.out.println(count);
            }
        }
    }
}
