

//import java.util.HashMap;
//import java.util.Scanner;
//
//public class MEX_rose {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while(t-->0){
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            HashMap<Integer, Integer> mp = new HashMap<>();
//            for(int i = 0; i<n; i++){
//                int num = sc.nextInt();
//                mp.put(num, mp.getOrDefault(num, 0) + 1);
//            }
//            int count = 0;
//            int ans = 0;
//            while(count < k){
//                if(!mp.containsKey(count)){
//                    ans++;
//                }
//                count++;
//            }
//            if(mp.containsKey(k)){
//                ans += mp.get(k);
//            }
//            System.out.println(ans);
//        }
//        sc.close();
//    }
//}
