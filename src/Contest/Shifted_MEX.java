package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class Shifted_MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);
            int maxx = 1;
            int curr = 1;
            for (int i = 0; i < n; i++) {
                if(i == 0){
                    continue;
                }
                else {
                    long d = a[i]-a[i-1];
                    if( d == 1 ){
                        curr++;
                    }
                    else if(d == 0){
                        continue;
                    }
                    else {
                        curr = 1;
                    }
                }
                maxx = Math.max(maxx, curr);
            }

            System.out.println(maxx);

        }
    }
}
