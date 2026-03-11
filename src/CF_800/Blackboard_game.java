import java.util.Scanner;

public class Blackboard_game {
    public static void main(String[] args) {
        char[] chars = {'1','2','3','3','2'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int count = 1;
        int j = 0;
        for(int i = 1; i<chars.length; i++){
            if(i == chars.length-1){

                if(chars[i-1] != chars[i]){
                    chars[j] = chars[i-1];
                    j++;
                    if(count > 1){
                        String s = "" + count;
                        for(int k = 0; k<s.length(); k++){
                            chars[j] = s.charAt(k);
                            j++;
                        }

                    }
                    count = 1;
                    chars[j] = chars[i];
                    j++;
                }
                else if(chars[i-1] == chars[i]){
                    chars[j] = chars[i];
                    j++;
                    String s = "" + count;
                    for(int k = 0; k<s.length(); k++){
                        chars[j] = s.charAt(k);
                        j++;
                    }
                }
                continue;
            }
            if(chars[i-1] != chars[i]){
                chars[j] = chars[i-1];
                j++;
                if(count > 1){
                    String s = "" + count;
                    for(int k = 0; k<s.length(); k++){
                        chars[j] = s.charAt(k);
                        j++;
                    }

                }
                count = 1;

            }
            else{
                count++;
            }


        }
        return j;
    }
}
