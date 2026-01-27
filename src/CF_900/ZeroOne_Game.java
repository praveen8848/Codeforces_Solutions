package CF_900;

import java.util.Scanner;
import java.util.Stack;

public class ZeroOne_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            String s = sc.next();

            Stack<Character> st = new Stack<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(st.isEmpty()){
                    st.push(c);
                }
                else if(c != st.peek()){
                    st.pop();
                    count++;
                }
                else {
                    st.push(c);
                }
            }
            if(count%2 == 0){
                System.out.println("NET");
            }
            else {
                System.out.println("DA");
            }
        }
    }
}
