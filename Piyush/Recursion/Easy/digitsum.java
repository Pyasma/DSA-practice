package Piyush.Recursion.Easy;

public class digitsum {
    public static void main(String[] args) {
        int ans = digit(1342);
        System.out.println(ans);
    }
    static int digit(int n){
        if (n == 0){
            return 0;
        }

        return n%10 + digit(n/10);
    }
}


