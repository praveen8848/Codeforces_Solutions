package CF_900;

import java.util.Scanner;

public class Strange_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long sum = 0;
            long max = 0;
            for (long l : a) {
                sum += l;
                max += (l + x -1)/x;
            }
            long min = 0;
            min = (sum+x-1)/x;
            System.out.println(min + " " + max);
        }

    }
}
