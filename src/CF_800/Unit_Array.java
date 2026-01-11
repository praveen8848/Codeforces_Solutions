
package CF_800;
import java.util.Scanner;

public class Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int c1 = 0;
            int cm1 = 0;
            for(int p : a){
                if(p == 1){
                    c1++;
                }
                else{
                    cm1++;
                }
            }
            int op = 0;
            while(c1<cm1 || cm1%2 == 1){
                op++;
                cm1--;
                c1++;
            }
            System.out.println(op);

        }
        sc.close();
    }
}
