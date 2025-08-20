package Piyush.Assignment.Functions;

public class Nine {
    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }

    static int Factorial(int n){
        if (n <= 1){
            return 1;
        }
        int ans= 1;
        while (n > 0){
            ans *= n; 
            n--;
        }return ans;
    }
}
