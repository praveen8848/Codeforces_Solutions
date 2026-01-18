package CF_900;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long min = 0;
        long max = 0;
        while (t-->0){
            long n = sc.nextLong();

            if(n%2 != 0 || n<=3){
                System.out.println(-1);
            }else{
                if(n%4 == 0){
                    max = n/4;
                }
                else{
                    max = (n-6)/4 + 1;
                }

                if(n%6 == 0) {
                    min = n / 6;
                }
                else {
                    long r = n%6;
                    if( r == 4){
                        min = n/6 + 1;
                    }
                    else if(r == 2){
                        min = (n-8)/6 + 2;
                    }
                }
                System.out.println(min + " " + max);
            }
        }
    }
}
