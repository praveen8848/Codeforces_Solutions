

import java.util.Scanner;

public class New_Year_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int op1 = solve(a, b);
            int op2 = solve(b,a);

            System.out.println(Math.max(op1, op2));
        }
    }

    private static int solve(int a, int b) {
        int layer = 0;
        int currentSize = 1;

        while (true){

            if(layer%2 == 0){
//                1, 4, 16,..
//                even layers
                if(a>=currentSize){
                    a -= currentSize;
                }
                else {
                    break;
                }
            }
            else{
                if (b>=currentSize){
                    b -= currentSize;
                }
                else{
                    break;
                }
            }
            layer++;
            currentSize = currentSize* 2;
        }
        return layer;
    }
}
