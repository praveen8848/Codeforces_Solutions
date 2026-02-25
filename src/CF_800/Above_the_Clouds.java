

import java.util.HashSet;
import java.util.Scanner;

public class Above_the_Clouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            boolean possible = false;
            for (int i = 1; i < n - 1; i++) {
                if (freq[s.charAt(i) - 'a'] > 1) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
