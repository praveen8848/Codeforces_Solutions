

import java.util.Scanner;

public class Lawn_Mower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            long w = sc.nextLong();

             long ans = n - n/w; ;
            System.out.println(ans);
        }
    }
}
