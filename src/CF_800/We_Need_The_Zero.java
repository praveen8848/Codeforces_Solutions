package CF_800;

import java.util.Scanner;

public class We_Need_The_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int x = 0;
            for (int i = 0; i < n; i++) {
                 a[i] = sc.nextInt();
                  x = x^a[i];
            }
            for(int i = 0; i<n; i++){
                a[i] = x^a[i];
            }
            int p = 0;
            for (int i = 0; i < n; i++) {
                p = p^a[i];
            }
            if(p == 0){
                System.out.println(x);
            }
            else{
                System.out.println(-1);
            }
        }

    }
}
