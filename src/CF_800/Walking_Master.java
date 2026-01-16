package CF_800;

import java.util.Scanner;

public class Walking_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long ans = 0;
            if(d<b){
                System.out.println(-1);
                continue;
            }

                ans = d-b;
                a = a+ans;
                if(a<c){
                    System.out.println(-1);
                    continue;
                }
                ans += a-c;

            System.out.println(ans);
        }
    }
}
