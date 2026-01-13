package CF_800;

import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();

            int c = 0;
            int ans = 0;

            for(int i = 0;i<n; i++){
                int  a = sc.nextInt();
                if(a == 0){
                    c++;
                    ans  = Math.max(ans, c);
                }
                else{
                    c = 0;
                }
            }
            System.out.println(ans);
        }
    }
}
