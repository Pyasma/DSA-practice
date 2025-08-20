package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Seventeen {
    public static void main(String[] args) {
        // We can add a Condition to check if it's equal to original input
        System.out.println(Pallindrome(10001));
    }

    static String Pallindrome(int n){
        String reversed = "";
        while (n > 0){
            int remainder = n%10;
            reversed += remainder;
            n/= 10;
        }return reversed;
    }

    static int Pallindrome2(int n){
        int reversed = 0;
        while (n > 0){
            int remainder = n%10;
            reversed += reversed*10+remainder;
            n/= 10;
        }return reversed;
    }

    static boolean isPallindromStr(int n){
        String str = Integer.toString(n);
        StringBuilder reversed = new StringBuilder(str);
        return str.equals(reversed.toString());
    }

    static boolean isPallindromeTwoPointer(int n){
        String s = Integer.toString(n);
        int start = 0, end = s.length()-1;

        while (start < end){
            if (s.charAt(end) != s.charAt(start)){
                return false;
            }start++;
            end--;
        }return true;
    }

    static boolean isBinaryPallindrome(int n){
        int start = 0;
        int end = 31;

        while (start<end){
            int startBit = (n>>start)&1;
            int endBit = (n >> end)&1;

            if (startBit != endBit){
                return false;
            }start++;
            end--;
        }return true;
    }
}
