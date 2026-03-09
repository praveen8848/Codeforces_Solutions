import java.util.Scanner;

public class Blackboard_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                if (n % 4 == 0) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            }
        }
        scanner.close();
    }
}
