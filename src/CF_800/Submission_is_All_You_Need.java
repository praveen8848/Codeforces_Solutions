package CF_800;

import java.util.Arrays;
import java.util.Scanner;

public class Submission_is_All_You_Need {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int ans = 0;

                for (int i = 0; i < n; i++) {
                    if(a[i] == 0){
                        ans++;
                    }
                    else{
                        ans += a[i];
                    }
                }

            System.out.println(ans);
        }
    }
}
