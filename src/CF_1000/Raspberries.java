

import java.util.Scanner;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n  = sc.nextInt();
            int k = sc.nextInt();

            boolean flag = false;
             int counteven = 0;
            int minimum = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int z = sc.nextInt();
                if(z%k == 0){
                    flag = true;
                }
                if(z%2 == 0)counteven++;
                int r = z%k;

                minimum = Math.min(k-r, minimum);
            }
            if(flag){
                System.out.println(0);
            }
            else {
                if(k == 4){
                    int mini = Math.max(0, 2-counteven);
                    System.out.println(Math.min(mini, minimum));
                    continue;
                }
                System.out.println(minimum);
            }
        }
    }
}
