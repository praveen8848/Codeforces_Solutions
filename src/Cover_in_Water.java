import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();

            int total = 0;
            int current = 0;
            boolean flag = true;
            for(int i = 0;i<s.length(); i++){
                if(s.charAt(i) == '#'){
                    total += current;
                    current = 0;
                }
                else {
                    current++;
                    if(current>2){
                        flag = false;
                        System.out.println(2);
                        break;

                    }
                }
            }
            total += current;
            t--;
           if(flag)  System.out.println(total);
        }
    }
}
