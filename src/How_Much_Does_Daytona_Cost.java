import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0;i<n; i++){
                a[i] = sc.nextInt();
            }
            boolean flag = false;

            for(int i =0;i<n; i++){
                if(a[i] == k){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
