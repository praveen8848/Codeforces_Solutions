import java.util.Scanner;

public class Red_Versus_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int r = sc.nextInt();
                int b = sc.nextInt();

                // There are (b + 1) regions for Rs created by b Blue wins.
                int baseGroup = r / (b + 1);
                int remainder = r % (b + 1);

                StringBuilder sb = new StringBuilder();

                // Iterate through each region
                for (int i = 0; i < b + 1; i++) {
                    // Determine size of this current group of Rs
                    // Start with base size
                    int currentGroupSize = baseGroup;

                    // If we still have 'remainder' extras to distribute, give one to this group
                    if (remainder > 0) {
                        currentGroupSize++;
                        remainder--;
                    }

                    // Print Rs for this region
                    for (int j = 0; j < currentGroupSize; j++) {
                        sb.append('R');
                    }

                    // Print a B after the Rs, but NOT after the very last group
                    if (i < b) {
                        sb.append('B');
                    }
                }
                System.out.println(sb);
            }
        }
    }
}