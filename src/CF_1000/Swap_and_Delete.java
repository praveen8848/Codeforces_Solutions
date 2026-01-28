import java.util.Scanner;


public class Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            String s = sc.next();

            int n = s.length();
            int zero = 0;
            int one = 0;
            for (int i = 0; i <n ; i++) {
                if(s.charAt(i) == '0'){
                    zero++;
                }
                else{
                    one++;
                }
            }
            int tt = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if(c == '0' && one>0){
                    one--;
                    tt++;
                }
                else if(c == '1' && zero>0){
                    zero--;
                    tt++;
                }
                else {
                    break;
                }
            }

            System.out.println(n-tt);
        }
    }
}
