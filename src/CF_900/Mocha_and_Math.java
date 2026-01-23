package CF_900;

import java.util.Scanner;

public class Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n= sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long m = a[0];
            for(int i = 0; i<n; i++){
                m = m&a[i];
            }
            System.out.println(m);
        }
    }
}
