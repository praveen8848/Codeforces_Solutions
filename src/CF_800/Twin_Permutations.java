package CF_800;

import java.util.Scanner;

public class Twin_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0;i<n; i++){
                a[i] = sc.nextInt();
            }
            int g = 1+n;
            for (int i = 0; i < n; i++) {
                System.out.print(g-a[i] + " ");
            }
            System.out.println();
        }
    }
}
