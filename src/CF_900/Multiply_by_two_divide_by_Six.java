package CF_900;

import java.util.Scanner;

public class Multiply_by_two_divide_by_Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();

            long count2 = 0;
            long count3 = 0;
            long ans = 0;
            if(n == 1){
                System.out.println(0);
                continue;
            }
            while (n%2 == 0){
                n = n/2;
                count2++;
            }
            while (n%3 == 0){
                n = n/3;
                count3++;
            }
            if(n != 1){
                System.out.println(-1);
                continue;
            }
            else {
                if(count3>count2){
                    long d = count3-count2;
                    ans+=d;
                    ans+=count3;
                }
                else if(count3 == count2){
                    ans+=count3;
                }
                else {
                    ans = -1;
                }
            }
            System.out.println(ans);
        }
    }

}
