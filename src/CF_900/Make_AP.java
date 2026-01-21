package CF_900;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean checkb = (a+c)%(2*b) == 0;
            int newC = 2*b-a;
            boolean checkc = (newC>=c) && (newC%c ==0);
            int newA = 2*b- c;
            boolean checka  = (newA>=a) && (newA%a == 0);
            if(checka||checkc||checkb){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
