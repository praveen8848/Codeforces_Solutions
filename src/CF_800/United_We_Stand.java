package CF_800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            List<Long> b = new ArrayList<>();
            b.add(a[0]);
            List<Long> c = new ArrayList<>();
            boolean flag = false;
            int i = 0;
            for(i = 1; i<n; i++){
                if(a[i] != a[i-1]){
                    c.add(a[i]);
                    flag = true;
                    break;
                }
                else{
                    b.add(a[i]);
                }
            }
            i++;
            while(flag && i<n){
                c.add(a[i]);
                i++;
            }
            if(c.isEmpty() || b.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(b.size()+" " + c.size());
                for (long integer : b) {
                    System.out.print(integer + " ");
                }
                System.out.println();
                for (long k : c) {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
}
