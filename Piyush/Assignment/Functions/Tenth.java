package Piyush.Assignment.Functions;

public class Tenth {
    public static void main(String[] args) {
        
    }

    static int reverse(int n){
        int reversed = 0;
        while (n > 0){
            int remainder = n%10;
            reversed += reversed*10 + remainder;
            n /= 10;
        }return reversed;
    }

    static void reverse2(int n){
        StringBuilder s = new StringBuilder(n);
        s.reverse();
        System.out.println(s.toString()); 
    }

    static void Pallindrome2(int n){
        String c = Integer.toString(n);
        //c = c.toCharArray();
        int start = 0;
        int end = c.length()-1;
        while (start < end){
            if (c.charAt(start) == c.charAt(end)){
                start++;
                end--;
            }else{
                System.out.println("Not a Pallindrome");
                return;
            }
        }System.out.println("Pallindrome");
        return;
    }

    static boolean Pallindrome(int n){
        return n == reverse(n);
    }
}
