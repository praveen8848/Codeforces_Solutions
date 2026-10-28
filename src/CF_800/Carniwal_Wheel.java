

import java.util.Scanner;

public class Carniwal_Wheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 1. Find the Greatest Common Divisor of the wheel size and the step size
            int g = gcd(l, b);

            int r = a % g;

            int maxPrize = (l - 1) - ((l - 1 - r) % g);

            System.out.println(maxPrize);
        }

    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
