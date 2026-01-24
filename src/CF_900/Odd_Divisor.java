

import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();

            if(n%2 == 0){
                while (n%2 == 0){
                    n = n/2;
                }
                if(n != 1){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
