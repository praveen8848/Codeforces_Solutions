
import java.util.Scanner;

public class Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();

            long[] secondMin = new long[n];
            long globalMin = Long.MAX_VALUE;

            long totalSmin = 0;

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long sMin = Long.MAX_VALUE;
                long fMin = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {
                    long temp = sc.nextLong();

                    if (temp < fMin) {
                        sMin = fMin;
                        fMin = temp;
                    }
                    else if (
                            temp < sMin) {
                        sMin = temp;
                    }
                    globalMin = Math.min(globalMin, temp);
                }

                if (sMin == Long.MAX_VALUE) {
                    secondMin[i] = fMin;
                    totalSmin+=secondMin[i];
                }
                else {
                    secondMin[i] = sMin;
                    totalSmin+=secondMin[i];
                }
            }
            long ans  = 0;
            for(long s : secondMin){
                totalSmin-=s;
                totalSmin+=globalMin;
                ans = Math.max(ans, totalSmin);
                totalSmin-=globalMin;
                totalSmin+=s;
            }
            System.out.println(ans);

        }
    }
}
