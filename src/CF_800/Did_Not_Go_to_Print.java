

import java.util.*;

public class Did_Not_Go_to_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n  = sc.nextInt();
            String s = sc.next();
            List<Integer> lst = new ArrayList<>();
            int countOne = 0;
            List<Integer> lst2 = new ArrayList<>();
            for(int i = 0; i<n; i++){
                int  x = s.charAt(i) - '0';
                if(x == 1){
                    lst.add(i+1);
                    countOne++;
                }
                else if(x == 2){
                    if(!lst.isEmpty() && countOne > 0){
                        countOne--;
                        lst.removeLast();
                        lst.add(0, i+1);
                    }
                }
            }
            if(lst.isEmpty() ){
                System.out.println(0);
            }
            else {
                System.out.println(lst.size());
                Collections.sort(lst);
                for (int k : lst) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
