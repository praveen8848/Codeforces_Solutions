

import java.util.Scanner;

public class Everybody_Likes_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int op = 0;
            long prev = -1;
            for (int i = 1; i < n; i++) {
                long a1 = a[i];
                long a2 = a[i-1];
                if(prev != -1){
                    a2 = prev;
                }
                if( a1%2 == a2%2){
                    if(a1%2 == 0){
                        prev = 2;
                    }
                    else {
                       prev = 1;
                    }

                    op++;
                }
                else{
                    prev = -1;
                }
            }
            System.out.println(op);
        }
    }
}
