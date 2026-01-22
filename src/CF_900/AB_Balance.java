

import java.util.Scanner;

public class AB_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            int l = s.length();

            char c1 = s.charAt(0);
            char c2 = s.charAt(l-1);
            if(c1 == c2){
                System.out.println(s);
            }
            else {
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(l-1);
                sb.append(c1);
                System.out.println(sb);
            }
        }
    }
}
