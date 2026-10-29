

import java.util.Scanner;

public class SauSaGe_Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            double pow  = n-k;
            int ans = 0;
            if(pow>0){
                k--;
                ans = (int)Math.pow(2, pow+1);
            }
            ans += 2*(k);
            System.out.println(ans);
        }
    }
}
