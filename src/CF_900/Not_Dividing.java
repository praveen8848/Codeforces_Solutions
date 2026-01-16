package CF_900;

import java.util.Scanner;

public class Not_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i <n-1 ; i++) {
                if(a[i] == 1){
                    if(i != 0){
                        if(a[i-1]%2 == 0){
                            a[i] = a[i]+2;
                        }
                        else {
                            a[i]++;
                        }
                    }
                    else {
                        a[i] = a[i]+1;
                    }
                }

                if(a[i+1]%a[i] == 0){
                    a[i+1]++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
