package Piyush.Maths;

public class CalculatingPower {
    public static void main(String[] args) {
        int n = 3;
        int b = 6;
        long ans = Calculating(n, b);
        System.out.println(ans);
    }
    // it will be running O(log b) times
    static long Calculating(int n, int b){
        long result = 1;
        long base = n;

        while (b > 0){
            if ((b&1) == 1){
                result *= base;
            }
            b >>= 1;
            base *=base;
        }return result; 

    }

}
