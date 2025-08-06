package Piyush.Assignment.FirstJava;
import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello";
        System.out.println(Pallindrome(s));
        System.out.println(Pallindrome2(s));
        System.out.println(Pallindrome3(s));
    }

    static boolean Pallindrome(String s){
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }return s.equals(reversed);
    }

    static boolean Pallindrome2(String s){
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        if (s.equals(sb.toString())){
            return true;
        }return false;
    }

    static boolean Pallindrome3(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }i++;
            j--;
        }return true;
    }
}
