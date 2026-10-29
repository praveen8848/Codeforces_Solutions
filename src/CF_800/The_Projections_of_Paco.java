

import java.util.Scanner;

public class The_Projections_of_Paco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int target = 2*arr[n-1];
            for(int i = n-2;i>=0;i--){
                int next =  arr[i]-target;
                if(next < 0){
                    next = -next;
                    target = arr[i]-next;
                }
                else{
                    target = arr[i] + next;
                }

            }
            int p = target/2;
            System.out.println(p);

        }
    }
}
