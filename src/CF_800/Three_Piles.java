

import java.util.Scanner;

public class Three_Piles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long curr = Math.abs(a-b);
            if(a>=b){
                a += c;
                c = 0;
            }
            else{
                long l = a + c;
                if(Math.abs( l-b)>curr){
                    a += c;
                    c = 0;
                }
            }
            if(a>b){
                b += c;
            }
            long ans = Math.abs(a-b);
            System.out.println(ans);

        }
        sc.close();
    }
}
