

import java.util.Scanner;

public class Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long[] a = new long[n];
            boolean flag = false;
            long last = k*b;
            if(last>s){
                flag = true;
            }
            long l = last + k-1;
            if(l<s){
                s -= l;
                a[n-1] = l;
            }
            else{
                a[n-1] = s;
                s = 0;
            }
            for (int i = n-2; i >=0 ; i--) {
                if(s == 0){
                    a[i] = 0;
                }
                else {
                    if (s>k-1){
                        a[i] = k-1;
                        s -= k-1;
                    }
                    else{
                        a[i] = s;
                        s = 0;
                    }
                }
            }
            if(flag || s>0){
                System.out.println(-1);
            }
            else {
                for (int i = 0; i <n ; i++) {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
