

import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int countOne = 0;
                int total = 0;
                boolean front = false;
                int countZero = 0;

                for (int i = 0; i < s.length(); i++) {
                    int c = s.charAt(i) - '0';
                    if (c == 1) {
                        if (!front) {
                            front = true;
                            if (countZero > 0) {
                                total += countZero / 3;
                                int r = countZero%3;
                                if (r == 2) total += 1;
                                countZero = 0;
                            }
                        } else {
                            total += countZero / 3;
                            countZero = 0;
                        }
                        countOne++;
                    } else {
                        countZero++;
                    }
                }
                if (!front) {
                    total += 1 + (countZero - 1) / 3;
                } else if (countZero > 0) {
                    total += countZero / 3;
                    int r = countZero%3;
                    if (r == 2) total += 1;
                }
                System.out.println(total + countOne);
            }
        }
    }
}