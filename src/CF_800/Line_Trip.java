package CF_800;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n+1];

            for(int i =1; i<n+1; i++){
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            int d = x - arr[n];
            ans = 2*d;

            for(int i = 0; i<n; i++){
                int diff = arr[i+1]-arr[i];
                ans = Math.max(ans, diff);
            }
            System.out.println(ans);
            t--;
        }
    }
}
