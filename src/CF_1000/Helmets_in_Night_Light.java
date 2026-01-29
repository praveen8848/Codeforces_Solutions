

import java.util.*;

public class Helmets_in_Night_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();
            long p = sc.nextLong();

            long[] a = new long[(int)n];
            long[] b = new long[(int)n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i <n ; i++) {
                b[i] = sc.nextLong();
            }
            List<Pair> lst = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lst.add(new Pair(a[i], b[i]));
            }

            lst.sort(Comparator.comparingLong(Pair -> Pair.cost));

            long directcost = p;
            long done = 1;

            for(Pair pair : lst){
                long maxShare = pair.maxShare;
                long cost = pair.cost;

                if(cost>=p){
                    break;
                }
                if(done+maxShare>n){
                    directcost += (n-done)*cost;
                    done = n;
                    break;
                }
                else{
                    directcost += maxShare*cost;
                    done += maxShare;
                }
            }
            directcost += (n-done)*p;
            System.out.println(directcost);

        }
    }
}
class Pair{
    long maxShare;
    long cost;
    public Pair(long m, long c){
        maxShare  = m;
        cost = c;
    }
}
