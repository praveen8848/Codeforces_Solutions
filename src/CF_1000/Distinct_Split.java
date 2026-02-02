
import java.util.HashMap;
import java.util.Scanner;

public class Distinct_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> mp1 = new HashMap<>();
            HashMap<Character, Integer> mp2 = new HashMap<>();

            for (int i = 0; i < n; i++) {
                mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0)+1);
            }
            int ans = 0;

            for (int i = 0; i < n; i++){
                char ch = s.charAt(i);
                if (mp1.containsKey(ch)){
                    mp1.put(ch, mp1.get(ch)-1);
                    if(mp1.get(ch) == 0){
                        mp1.remove(ch);
                    }
                    mp2.put(ch, mp2.getOrDefault(ch, 0)+1);
                    ans = Math.max(ans, mp1.size()+mp2.size());
                }
            }
            System.out.println(ans);
        }
    }
}
