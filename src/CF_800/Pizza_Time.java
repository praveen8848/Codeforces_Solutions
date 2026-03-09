package CF_800;

import java.util.Scanner;

public class Pizza_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextInt();

            long ans = 0;
            if(n<5){
                ans = 1;
            }
            else if(n<=9){
                if(n == 6 || n == 5){
                    ans = 2;
                } else if (n == 9) {
                    ans = 4;
                }
                else{
                    ans = 3;
                }
            }
            else {
                long r = n%3;
                long times3 = n/3;
                ans = times3;
                if(r == 0){
                    ans =
                }
            }
        }
    }
}
