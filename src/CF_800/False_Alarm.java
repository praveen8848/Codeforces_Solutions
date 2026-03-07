

import java.util.Scanner;

public class False_Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n  = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean flag = false;
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                if(a[i] == 1){
                    flag = true;
                    if(x>0){
                        x--;
                    }
                    else{
                        ans = true;
                        System.out.println("No");
                        break;

                    }
                }
                else{
                    if(flag){
                        x--;
                    }
                }
            }
            if(!ans){
                System.out.println("Yes");
            }

        }
    }
}
