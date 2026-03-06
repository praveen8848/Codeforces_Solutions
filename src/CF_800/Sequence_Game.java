package CF_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            List<Long> a = new ArrayList<>();
            a.add(b[0]);

            for (int i = 1; i < n; i++) {
                if(b[i-1]<=b[i]){
                    a.add(b[i]);
                }
                else{
                    a.add(1L);
                    a.add(b[i]);

                }
            }
            System.out.println(a.size());
            for (Long x: a) {
                System.out.print( x + " ");
            }
            System.out.println();

        }
    }
}
