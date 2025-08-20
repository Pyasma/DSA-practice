package Piyush.Assignment.Arrays.Easy;
import java.util.HashMap;

public class Ten {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(Pangram(sentence));
        System.out.println(sentence.length());
    }
    static boolean Pangram(String sentence){
        sentence= sentence.toLowerCase();
        StringBuilder sb = new StringBuilder(sentence);
        HashMap<Character, Integer> CharMap= new HashMap<>();
        
        for (char c  = 'a'; c <= 'z'; c++){
            CharMap.put(c,0);
        }

        int n = sb.length();
        if (n < 26){
            return false;
        }
        for (int i = 0; i < n; i++){
            char ch = sb.charAt(i);
            if (CharMap.containsKey(ch)){
                CharMap.put(ch,CharMap.get(ch)+1);                }
        }
        
        for (int count: CharMap.values()){
            if (count==0){
                return false;
            }
        }return true; 
    }

    ////https://leetcode.com/problems/check-if-the-sentence-is-pangram/

    static boolean PangramEasy(String sentence){
        boolean[] seen = new boolean[26];
        
        for (int i : sentence.toCharArray()){
            seen[i-'a'] = true;
            // here whatever i is we are subtracting it from a which would mean if we are on 20th keyword it 
        }
        for (boolean letterseen : seen){
            if (letterseen == false){
                return false;
            }
        }return true;
    }
}
