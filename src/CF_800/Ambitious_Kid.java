package CF_800;

import java.util.Scanner;

public class Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            long mini = Long.MAX_VALUE;
            for(int i = 0;i<n;i++){
                long x = sc.nextLong();
                mini = Math.min(mini, Math.abs(x));
            }

            System.out.println(mini);


    }
}
