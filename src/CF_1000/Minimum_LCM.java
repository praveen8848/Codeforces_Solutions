

import java.util.Scanner;

public class Minimum_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            isPrimeOrNot(n);

        }
    }
    public static void isPrimeOrNot(long n){

        for (int i = 2; i*i <= n; i++) {
            if(n%i == 0){
                long a = n/i;
                long b = n-a;
                System.out.println(a+" " + b);
                return;
            }
        }
        System.out.println(1+ " " + (n-1));

    }
}
