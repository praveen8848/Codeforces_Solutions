

import java.util.Scanner;

public class Blackslex_and_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                int min = (k * x) + 1;
                System.out.println(min);
            }
        }

        scanner.close();
    }
}
