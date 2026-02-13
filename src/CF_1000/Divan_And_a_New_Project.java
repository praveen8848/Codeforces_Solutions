

import java.util.Arrays;
import java.util.Scanner;

public class Divan_And_a_New_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            // Create a 2D array: [n][0] is the ID, [n][1] is the visit count
            int[][] buildings = new int[n][2];

            for (int i = 0; i < n; i++) {
                buildings[i][0] = i + 1;       // Original ID (1-indexed)
                buildings[i][1] = sc.nextInt();  // Number of visits
            }

            // Sort the 2D array by the 2nd column (visits) in descending order
            Arrays.sort(buildings, (a, b) -> Integer.compare(b[1], a[1]));

            long[] coords = new long[n + 1];
            coords[0] = 0; // Headquarters

            long totalTime = 0;
            long distance = 1;
            long sign = 1;

            // Assign coordinates using the sorted array
            for (int i = 0; i < n; i++) {
                int id = buildings[i][0];
                long visits = buildings[i][1];

                long currentCoord = distance * sign;
                coords[id] = currentCoord;

                // 2 * distance * visits
                totalTime += 2L * distance * visits;

                // Alternate left/right, increment distance after completing a pair
                sign = -sign;
                if (sign == 1) {
                    distance++;
                }
            }

            System.out.println(totalTime);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                sb.append(coords[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
;
    }
}
