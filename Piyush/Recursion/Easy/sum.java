package Piyush.Recursion.Easy;

public class sum {
    public static void main(String[] args) {
        int test = sumofn(10);
        System.out.println(test);
    }
    static int sumofn(int n){
        if (n <= 1 ){
            return 1;
        }

        return n + sumofn(n-1);
    }
    
}
