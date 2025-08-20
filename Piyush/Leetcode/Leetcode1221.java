package Piyush.Leetcode;

public class Leetcode1221 {
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        System.out.println(balancedString(s));
    }
    static int balancedString(String s){
        int len = s.length();
        int sum = 0;
        int count = 0;
        for (int i =0; i < len; i++){
            if (s.charAt(i) == 'R'){
                sum++;
            }if (s.charAt(i) == 'L'){
                sum--;
            }
            if (sum == 0){
                count++;
            }
        }return count;
    }
}
