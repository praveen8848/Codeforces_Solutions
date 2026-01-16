package CF_900;

import java.util.Scanner;

public class Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int c = 1;
            int ans = 1;

            for(int i = 1; i<n; i++){
                char c1 = s.charAt(i-1);
                char c2 = s.charAt(i);
                if(c1 == c2){
                    c++;
                }
                else {
                    c = 1;
                }
                ans = Math.max(ans, c);
            }
            System.out.println(ans+1);
        }
    }
}
