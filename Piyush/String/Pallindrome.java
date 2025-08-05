package Piyush.String;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("abcsbdr"));
        System.out.println(isPallindrome2("Hello"));
    }
    static boolean isPallindrome(String str){
        str= str.toLowerCase();
        if (str == null || str.length() == 0){
            return true;
        }
        StringBuilder sb = new StringBuilder(str);
        
        int start = 0;
        int end = sb.length()-1;
        int len = end+1;      
        while (start <= len/2 && end >= len/2){
            if (sb.charAt(start) == sb.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }return true;
    }

    static boolean isPallindrome2(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }return true;
    }
}
