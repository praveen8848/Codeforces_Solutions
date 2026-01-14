

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long y = n/k;
            long r = n%k;
            if(n%2 == 0){
                System.out.println("YES");
            }else {
                if(k%2 == 0){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
