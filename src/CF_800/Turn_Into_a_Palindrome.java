
import java.util.Scanner;

public class Turn_Into_a_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            int ans = 0;
            for(int i = 0; i<n/2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    if(s.charAt(i) == c){
                        ans++;
                    }
                    else if(s.charAt(n-i-1) == c){
                        ans++;
                    }
                    else{
                        ans += 2;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
