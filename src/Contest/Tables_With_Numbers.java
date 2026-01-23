import java.util.Scanner;

public class Tables_With_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            int minDim = Math.min(h, l);
            int maxDim = Math.max(h, l);

            int countSmall = 0;
            int countLarge = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a <= minDim) {
                    countSmall++;
                } else if (a <= maxDim) {
                    countLarge++;
                }
            }

            if (countSmall <= countLarge) {
                System.out.println(countSmall);
            } else {
                System.out.println(countLarge + (countSmall - countLarge) / 2);
            }
        }
    }
}