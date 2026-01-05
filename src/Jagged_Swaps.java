import java.util.Scanner;

public class Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n; i++){
                a[i] = sc.nextInt();
            }
            int minimum = Integer.MAX_VALUE;
            for(int i = 1; i<n; i++){
                minimum = Math.min(minimum, a[i]);
            }
            t--;
            if (minimum<a[0]){
                System.out.println("NO");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
