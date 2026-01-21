package CF_900;

import java.util.Scanner;

public class Odd_Grasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long x = sc.nextLong();
            long n = sc.nextLong();
            long ans = 0;
            if(n == 0){
                System.out.println(x);
                continue;
            }
            if(x%2 == 0){
                if(n%2 == 0){
                    long tt =  n/2;
                    if(tt%2 == 0){
                        ans = x;
                    }
                    else{
                        ans = x+1;
                    }
                    System.out.println(ans);
                    continue;
                }
                long k = n+1;
                if(k%4 == 0){
                    ans = x+k;
                    System.out.println(ans);
                    continue;
                }
                k = n+3;
                if(k%4 == 0){
                    ans = (x+3) -k;
                }
                System.out.println(ans);

            }
            else{
                if(n%2 == 0){
                    long tt =  n/2;
                    if(tt%2 == 0){
                        ans = x;
                    }
                    else{
                        ans = x-1;
                    }
                    System.out.println(ans);
                    continue;
                }
                long k = n+1;
                if(k%4 == 0){
                    ans = x - k;
                    System.out.println(ans);
                    continue;
                }
                k = n+3;
                if(k%4 == 0){
                    ans = (x-3) + k;
                }
                System.out.println(ans);
            }

        }
    }
}
