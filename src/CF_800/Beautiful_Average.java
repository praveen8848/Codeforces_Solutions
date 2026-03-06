

import java.util.Scanner;

public class Beautiful_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int maxx = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                maxx = Math.max(a, maxx);
            }
            System.out.println(maxx);
        }
        sc.close();
    }
}
