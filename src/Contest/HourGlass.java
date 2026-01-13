package Contest;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();


            long N = m / k;
            long rem = m % k;

            if (s <= k) {
                System.out.println(Math.max(0, s - rem));
            } else {
                if (N % 2 == 0) {
                    System.out.println(s - rem);
                } else {
                    System.out.println(k - rem);
                }
            }
        }
    }
}
