

import java.util.Scanner;

public class Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            String s = Integer.toString(n);
            int length = s.length();
            int firstDigit = s.charAt(0) - '0';

            // Formula:
            // 9 * (number of previous magnitudes) + (value of the first digit)
            int ans = 9 * (length - 1) + firstDigit;

            System.out.println(ans);
        }
    }
}
