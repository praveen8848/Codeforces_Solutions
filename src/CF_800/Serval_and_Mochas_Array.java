package CF_800;

import java.util.Scanner;

public class Serval_and_Mochas_Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int  n  = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean flag= false;
            for(int i = 0; i<n; i++){
                for (int j = i+1; j <n ; j++) {
                    int c = gcd(a[i], a[j]);
                    if(c<=2){
                        flag = true;
                    }
                }

            }
            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static int gcd(int a, int b){
        while(b != 0){
            int t = b;
            b  = a%b;
            a = t;
        }
        return a;
    }
}
