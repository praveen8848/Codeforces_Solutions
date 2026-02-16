

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Array_Coloring_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mp.put(a[i], i);
            }
            boolean flag = false;
            Arrays.sort(a);
            for (int i = 1; i < n; i++) {
                int prev = mp.get(a[i-1]);
                int curr = mp.get(a[i]);
                if(prev%2 == 0 && curr%2 ==0){
                    flag = true;
                    break;
                }
                else if(prev%2 != 0 && curr%2 !=0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
