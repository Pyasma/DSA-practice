package Piyush.Recursion.Easy;

public class count0 {
    public static void main(String[] args) {
        System.out.println(countdigits(30204));
        System.out.println(countdigits2(30204, 0));
        System.err.println(count(100056077));
    }
    static int countdigits(int n){
        if (n == 0){
            return 0;
        }
        int count = ((n%10) == 0) ? 1:0; 
        return count + countdigits(n/10);
    }
    static int countdigits2(int n,int count){
        if (n == 0){
            return count;
        }
        if (n%10 == 0){
            return countdigits2(n/10,count+1);
        }else{
            return countdigits2(n/10, count);
        }
    }
    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n,int c){
        if (n == 0){
            return c;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }
}
