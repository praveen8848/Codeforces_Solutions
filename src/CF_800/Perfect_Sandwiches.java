
import java.util.Scanner;

public class Perfect_Sandwiches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b>=a){
                System.out.println(-1);
            }
            else{
                int c = a-b;
                if(c>=b){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
        }
    }
}
