
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            
            long k = sc.nextLong();

            List<long[]> lst = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                lst.add( new long[]{ x, i+1});
            }

            for(long[] hp : lst){
                hp[0] = hp[0]%k;
                if(hp[0] == 0){
                    hp[0] = k;
                }
            }

            lst.sort((a,b) -> {
                if(a[0] != b[0]){
                    return Long.compare(b[0], a[0]);
                }
                return Long.compare(a[1], b[1]);
            });

            for(long[]  hp: lst){
                System.out.print(hp[1] + " ");
            }
            System.out.println();
        }
    }
}
