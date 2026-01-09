package CF_900;

import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k  =sc.nextInt();
            String s = sc.next();

            int[] c = new int[26];
            for(int i = 0; i<n; i++){
                c[s.charAt(i)-'a']++;
            }
            int countodd = 0;
            boolean flag = false;
            for(int i = 0;i<26; i++){
                if(c[i]%2 != 0){
                    countodd++;
                    if(countodd>1 && k>0){
                        c[i]-=1;
                        k--;
                    }
                    else if(countodd>1){
                        flag = true;
                    }
                }
            }
            if(flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
// The Idea is to reduce the number of characters that have odd frequency to 1.
// in simple at-most one character is allowed to have odd frequency to make a String Palindrome.