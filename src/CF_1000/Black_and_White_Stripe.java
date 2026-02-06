
import java.util.Scanner;

public class Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int i = 0;
            int j = 0;
            int ans = Integer.MAX_VALUE;
            int count = 0;
            while (i<n){
                char c = s.charAt(i);
                if(c == 'W'){
                    count++;
                }
                 if (i-j+1 == k){
                     ans = Math.min(count, ans);
                    if(s.charAt(j) == 'W'){
                        count--;
                    }
                    j++;
                }
                 i++;
            }
            System.out.println(ans);
        }
    }
}
