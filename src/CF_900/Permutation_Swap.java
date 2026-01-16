package CF_900;

import java.util.Scanner;

public class Permutation_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int j = a[i]-1;
                int d = Math.abs(j-i);
                ans = gcd(ans, d);
            }
            System.out.println(ans);

        }


    }
     static int gcd(int a, int b){
        while(b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}
