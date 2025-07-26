package com.Piyush;

public class SearchChar {
    public static void main(String[] args) {
        String name = "Piyush";
        char target = 'y';
        boolean ans = searchar(name, target);
        System.out.println(ans);
    }
    static boolean searchar(String str, char target){
        if (str.length() ==  0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    static boolean searcharacter(String str, char target){
        if (str.length() ==  0){
            return false;
        }
        for (char i : str.toCharArray()){
            if (i == target){
                return true;
            }
        }
        return false;
    }
}
