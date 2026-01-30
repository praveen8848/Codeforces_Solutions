
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Divisible_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            int[] ans = new int[n];
            ans[n-1] = n;
            ans[n-2]  = 1;
            HashSet<Integer> st = new HashSet<>();
            for (int i = n-2; i>=0 ; i--) {
                int current = i+1;
                int x = ans[current]-current;
                int y = ans[current]+current;
                if(x>0 && x<=n && !st.contains(x)){
                    ans[i] = x;
                    st.add(x);
                } else if (y>0 && y<=n && !st.contains(y)) {
                    ans[i] = y;
                    st.add(y);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
