package CF_800;

import java.util.Scanner;

public class Dont_try_to_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            if(x.contains(s)){
                System.out.println(0);
                t--;
                continue;
            }
            StringBuilder xx = new StringBuilder(x);
            int ans = 0;
            int ret = -1;
            while(xx.length()<=(s.length()+x.length())){
                xx.append(xx);
                ans++;
                if(xx.toString().contains(s)){
                    ret = ans;
                    break;
                }
            }
            t--;
            System.out.println(ret);
        }
    }
}
