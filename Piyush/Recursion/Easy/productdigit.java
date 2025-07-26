package Piyush.Recursion.Easy;

public class productdigit {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * sum(n/10);
    }
}
