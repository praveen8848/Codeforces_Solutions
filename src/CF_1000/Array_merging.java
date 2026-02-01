

import java.util.HashMap;
import java.util.Scanner;

public class Array_merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i<n; i++){
                b[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> mapA = new HashMap<>();
            HashMap<Integer, Integer> mapB  = new HashMap<>();
            int count1 = 1;
            int count2 = 1;
            mapA.put(a[0], count1);
            mapB.put(b[0], count2);
            for (int i = 1; i <n ; i++) {
                if(a[i] == a[i-1]){
                    count1++;
                }
                else{
                    count1 = 1;
                }
                if(b[i] == b[i-1]){
                    count2++;
                }
                else {
                    count2 = 1;
                }
                mapA.put(a[i], Math.max(mapA.getOrDefault(a[i], 0), count1));
                mapB.put(b[i], Math.max(mapB.getOrDefault(b[i], 0), count2));
            }
            int ans = 1;
            for(var e : mapA.keySet()){
                if(mapB.containsKey(e)){
                    ans = Math.max(ans, mapA.get(e)+mapB.get(e));
                }
                else{
                    ans = Math.max(ans,mapA.get(e));
                }
            }
            for(var e : mapB.keySet()){
                ans = Math.max(ans,mapB.get(e));
            }
            System.out.println(ans);
        }
    }

}
