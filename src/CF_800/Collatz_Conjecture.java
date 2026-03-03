import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();

            long initialValue = (long) x * (1L << k);

            System.out.println(initialValue);
        }

    }
}
