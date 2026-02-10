

import java.util.Scanner;

public class Triangles_on_a_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            long w = scanner.nextLong(); // Read the width of the rectangle
            long h = scanner.nextLong(); // Read the height of the rectangle
            long area = Long.MIN_VALUE; // Initialize the maximum area to the smallest possible integer
            for (int i = 0; i < 4; i++) { // Loop over the four sides of the rectangle
                long k = scanner.nextLong(); // Read the number of points on the current side
                long first = 0, last = 0;
                for (int j = 0; j < k; j++) { // Loop over the points on the current side
                    long x = scanner.nextLong(); // Read the x or y coordinate of the point
                    if (j == 0) {
                        first = x; // Store the first point
                    }
                    if (j == k - 1) {
                        last = x; // Store the last point
                    }
                }
                long base = last - first; // Calculate the base of the triangle
                long height;
                if (i <= 1) {
                    height = h; // For horizontal sides, the height is the rectangle's height
                } else {
                    height = w; // For vertical sides, the height is the rectangle's width
                }
                area = Math.max(area, base * height); // Update the maximum area
            }
            System.out.println(area); // Output the doubled maximum area
        }
        scanner.close();
    }
}
