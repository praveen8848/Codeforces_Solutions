package CF_800;

import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int i = 0;
            int j = n-1;
            while(i<j){
                char st = s.charAt(i);
                char en = s.charAt(j);

                if(st == en){
                    break;
                }
                i++;
                j--;
            }
            int ans = j-i;
            System.out.println(ans+1);
        }
    }
}
