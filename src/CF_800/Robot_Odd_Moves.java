

import java.util.Scanner;

public class Robot_Odd_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a  = sc.nextInt();
            int b = sc.nextInt();

            // Condition 1: Target is completely out of vertical reach
            if (b > a + 1) {
                System.out.println(-1);
            }
            // Condition 2: Target is reachable and parities match exactly
            else if (a % 2 == b % 2) {
                System.out.println(a);
            }
            // Condition 3: Target is reachable but parities are different
            else {
                System.out.println(a + 1);
            }
        }
        sc.close();
    }
}
