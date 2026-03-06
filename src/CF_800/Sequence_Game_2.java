

import java.util.Scanner;

public class Sequence_Game_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long minn = Long.MAX_VALUE;
            long maxx = Long.MIN_VALUE;

            for(int i = 0;i<n; i++){
                long a = sc.nextLong();
                minn = Math.min(a, minn);
                maxx = Math.max(a, maxx);
            }
            long x  = sc.nextLong();

            if(x>=minn && x<=maxx){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
