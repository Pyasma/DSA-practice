package Piyush.Recursion.Easy;

public class palindrome {
    public static void main(String[] args) {
        long ans = 122231;
        System.out.println(pallin(ans));
    }   
    static long Reverse3(long n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function  (helper function)
        long digits = (long)(Math.log10(n)) + 1;
        return helper(n,digits);

    }
    private static long helper(long n, long digits){
        if ((n%10) == n){
            return n;
        }
        long rem = n%10;
        return rem*(long)Math.pow(10, digits-1) + helper(n/10, digits-1);
    } 
    static boolean pallin(long n){
        return n == Reverse3(n);
    }
}
