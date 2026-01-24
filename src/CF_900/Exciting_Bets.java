package CF_900;

import java.util.Scanner;

public class Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans = 0;
            long op1 = 0;
            long op2 = 0;
            if(Math.abs(a-b) == 1){
                ans = 1;
            }
            else if(Math.abs(a-b)>1){
                ans = Math.abs(a-b);
                if(a%ans != 0){
                    op2 = a%ans;
                    op1 = ans - op2;
                    op1 = Math.min(op1, op2);
                }
            }
            System.out.println(ans + " " + op1);

        }
    }
}
