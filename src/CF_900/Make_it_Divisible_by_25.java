
import java.util.HashMap;
import java.util.Scanner;

public class Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();

            String s = String.valueOf(n);
            int l = s.length();

            int five = -1;
            int zero = -1;
            for (int i = s.length()-1; i>=0 ; i--) {
                char c = s.charAt(i);
                if(  c == '0' && zero == -1){
                   zero = i
;               }
                if(c == '5' && five == -1){
                    five = i;
                }
            }

            boolean flag5 = false;
            int ans5 = -1;
            if(five != -1){
                for (int i = five-1; i>=0 ; i--) {
                    if(s.charAt(i) == '7' || s.charAt(i) == '2'){
                        ans5 = l-2-i;
                        break;
                    }
                }
            }
            int ans0 = -1;
            if(zero != -1){
                for (int i = zero-1; i>=0 ; i--) {
                    if(s.charAt(i) == '0' || s.charAt(i) == '5'){
                        ans0 = l-2-i;
                        break;
                    }
                }
            }
            if(ans0 == -1||ans5 == -1){
                System.out.println(Math.max(ans0, ans5));
            }
            else {
                System.out.println(Math.min(ans0,ans5));
            }
        }
    }
}
