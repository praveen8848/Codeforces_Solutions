

import java.util.Arrays;
import java.util.Scanner;

public class Your_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();

            Arrays.sort(sChars);
            Arrays.sort(tChars);

            if (Arrays.equals(sChars, tChars)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
