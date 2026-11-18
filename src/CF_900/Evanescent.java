
import java.util.Scanner;

public class Evanescent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int all = 1;
            // from start
            int x = n-1;
            for(int i = 1; i<n; i++){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i-1);
                if(c1 != c2){
                    x = i;
                    break;
                }
            }
            // from end
            int y = 0;
            for(int i = n-2; i>=0; i--){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                if(c1 != c2){
                    y = i;
                    break;
                }
            }
            // find the character with 1 occurrence from x to y;
            int count = 1;
            boolean found = false;
            for(int i = x; i<=y; i++){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                if(c1 != c2){
                   if(count == 1){
                       found = true;
                       if(i>0){
                           if(c2 == s.charAt(i-1)){
                               all--;
                               break;
                           }
                       }
                   }
                   count = 1;
                }
                else{
                    count++;
                }
            }
            // count all

            for(int i = 1; i<n; i++){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i-1);
                if(c1 != c2){
                    all++;
                }
            }
            if(found){
                all--;
            }
            System.out.println(all);
        }
        sc.close();
    }
}
