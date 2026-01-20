package CF_900;

import java.util.HashMap;
import java.util.Scanner;

public class Deletive_Editing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            String t = sc.next();
            HashMap<Character, Integer> mp  = new HashMap<>();
            int slen = s.length();
            int tlen = t.length();
            int j = tlen-1;
            for (int i = slen-1; i>=0 && j>=0; i--) {
                char cs = s.charAt(i);
                char ts = t.charAt(j);
                if(cs == t.charAt(j)){
                    if(mp.containsKey(cs)){
                        break;
                    }
                    j--;
                }
                else {
                    mp.put(cs, mp.getOrDefault(cs, 0)+1);
                }
            }
            if(j<0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
