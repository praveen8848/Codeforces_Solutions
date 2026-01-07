import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long[] num = new long[3];
            for(int i = 0;i<3;i++){
                num[i] = sc.nextLong();
            }
            if(num[0] != num[1]) {
                    if(num[0]+num[2] > num[1]+num[2] ){
                        System.out.println("First");
                    }
                    else if(num[0]+num[2] <num[2]+num[1]){
                        System.out.println("Second");
                    }
                    else{
                        if(num[0]>num[1]){
                            System.out.println("First");
                        }
                        else{
                            System.out.println("Second");
                        }
                    }
                    continue;
            }
               if(num[2] %2 != 0){
                   System.out.println("First");
               }
               else{
                   System.out.println("Second");
               }
        }
    }
}
