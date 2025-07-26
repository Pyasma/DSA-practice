package Piyush.Recursion.Easy;

public class ReverseNum {
    public static void main(String[] args) {
        Reverse2(12346); 
        System.out.println(sum);
        int ans = Reverse(12345,0);
        System.out.println(ans);
        System.out.println(Reverse3(1245));
    } 
    
    static int Reverse(int n, int sum){
        if (n == 0){
            return sum;
        }
        sum = sum*10 + n%10;
        return Reverse(n/10, sum);
    }
    static int sum = 0;
    static void Reverse2(int n ){
        if (n == 0){
            return;
        }
        int rem = n %10;
        sum = sum*10 + rem;
        Reverse2(n/10);
    }
    static long Reverse3(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function  (helper function)
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);

    }
    private static long helper(int n, int digits){
        if ((n%10) == n){
            return n;
        }
        int rem = n%10;
        return rem*(long)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}
