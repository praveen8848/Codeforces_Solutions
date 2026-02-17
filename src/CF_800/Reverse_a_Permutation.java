
import java.util.Scanner;

public class Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] pos = new int[n+1];

            int maxIndex = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                pos[a[i]] = i;

            }

            for (int i = 0; i < n; i++) {
                int exp = n-i;
                if(exp != a[i]){
                    int index = pos[exp];
                    while(i<index){
                        int temp = a[index];
                        a[index] = a[i];
                        a[i] = temp;
                        i++;
                        index--;
                    }
                    break;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();

        }
    }
}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//
//    while (t-->0){
//        int n = sc.nextInt();
//        int[] a = new int[n];
//
//        int maxIndex = 0;
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        int index = 0;
//        while(index < n){
//            maxIndex = index;
//
//            for (int i = index+1; i <n; i++) {
//                if(a[i]>a[maxIndex]){
//                    maxIndex = i;
//                }
//            }
//
//            if(maxIndex == index){
//                index++;
//            }
//            else{
//                break;
//            }
//        }
//
//        if(index<n){
//            while (index<maxIndex){
//                int temp = a[maxIndex];
//                a[maxIndex] = a[index];
//                a[index] = temp;
//                maxIndex--;
//                index++;
//            }
//        }
//        for (int j = 0; j < n; j++) {
//            System.out.print(a[j] + " ");
//        }
//        System.out.println();
//
//    }
//}
