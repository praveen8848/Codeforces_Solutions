

import java.util.Scanner;

public class One_And_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            int totaltwo = 0;
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
                if(a[i] == 2){
                    totaltwo++;
                }
            }
            int fly = 0;
            int ans = -1;
            for (int i = 0;i<n; i++){
                if(a[i] == 2){
                    fly++;
                }
                if(fly == totaltwo-fly){
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);

        }
    }
}
