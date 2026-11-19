package CF_900;

import java.util.Scanner;

public class Fun_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int minn = Integer.MAX_VALUE;
            int maxx = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                minn = Math.min(minn, arr[i]);
                maxx = Math.max(maxx,arr[i]);
            }
            int sum = minn + maxx;
            for(int i = 0; i<n; i++){
                System.out.print( sum - arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}