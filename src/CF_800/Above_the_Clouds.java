

import java.util.HashSet;
import java.util.Scanner;

public class Above_the_Clouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;

            // Loop 1: Check if a middle element matches anything in the prefix
            HashSet<Character> st = new HashSet<>();
            st.add(s.charAt(0));
            // Only go up to n-2 to ensure 'c' is not empty
            for (int i = 1; i < n - 1; i++) {
                if (st.contains(s.charAt(i))) {
                    flag = true;
                    break;
                }
                st.add(s.charAt(i));
            }

            // Loop 2: Check if a middle element matches anything in the suffix
            if (!flag) {
                HashSet<Character> st2 = new HashSet<>();
                st2.add(s.charAt(n - 1));
                // Only go down to index 1 to ensure 'a' is not empty
                for (int i = n - 2; i > 0; i--) {
                    if (st2.contains(s.charAt(i))) {
                        flag = true;
                        break;
                    }
                    st2.add(s.charAt(i));
                }
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
