import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Specialty_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                // Odd length strings can never have all characters paired
                if (n % 2 != 0) {
                    System.out.println("NO");
                    continue;
                }

                Deque<Character> stack = new ArrayDeque<>();

                for (int i = 0; i < n; i++) {
                    char current = s.charAt(i);

                    if (!stack.isEmpty() && stack.peek() == current) {
                        stack.pop(); // Pair matched, turn both into '*'
                    } else {
                        stack.push(current);
                    }
                }

                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}