

import java.util.Scanner;

public class Prefix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] a = new int[n];
            int maxx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                maxx = Math.max(maxx, a[i]);
            }
            int ans = n*maxx;
            System.out.println(ans);
        }
    }
}
