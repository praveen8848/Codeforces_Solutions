

import java.util.Scanner;

public class Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            if(n%2 != 0){
                System.out.println(0);
            }
            else{
                int count = 1;
                if(n>4){
                    count += n/4;
                }
                else {
                    if(n%4 == 0){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
