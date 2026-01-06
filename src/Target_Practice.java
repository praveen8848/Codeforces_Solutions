import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String[] grid = new String[10];
            for(int i = 0;i<10; i++){
                grid[i] = sc.next();
            }
            int ans = 0;
            for(int i = 0;i<10; i++){
                String s = grid[i];
                int cr = 0;
                for(int j = 0;j<s.length();j++){
                    char c = s.charAt(j);
                    if(c == 'X'){
                        int ring = Math.min(Math.min(i, 9-i),Math.min(j, 9-j));
                        cr  = ring+1;
                        ans+=cr;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
