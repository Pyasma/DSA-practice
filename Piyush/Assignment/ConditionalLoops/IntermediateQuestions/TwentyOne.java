package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Set;

public class TwentyOne {
    
    public static void main(String[] args) {
        
    }
    static void ConsonantOrVowel(char c){
        while (c >= 'a' && c <= 'z'){
            if (c == 'a' ||  c== 'e'|| c == 'i' || c == 'o' || c == 'u'){
                System.out.println("Vowels");
            }else {
                System.out.println("Consonant");
            }
        }

    }

    static void SwitchCase(char c){
        switch (Character.toLowerCase(c)){
            case 'a' : case 'e' : case 'i' :  case 'o': case 'u':
                System.out.println("Vowels");
                break;
            default:
                if (Character.isLetter(c)){
                    System.out.println("Consonant");
                }else{
                    System.out.println("Not a Valid Letter");
                }
        }
    }

    static void VowelOrConsonant(char c){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        c = Character.toLowerCase(c);

        if (Character.isLetter(c)){
            if (vowels.contains(c)){
                System.out.println("Vowels");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Not a Valid Letter");
        }
    }
}

