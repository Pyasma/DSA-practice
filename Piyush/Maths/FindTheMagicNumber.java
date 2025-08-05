package Piyush.Maths;

public class FindTheMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = MagicNumber(n);
        System.out.println(ans);
        AnotherLogic(n);
    }
    
    static int MagicNumber(int n){
        int sum = 0;
        for (int i = 0; i < 32; i++){
            if (((n >> i)&1) == 1){
                sum += (int)Math.pow(5,i);
            }
        }return sum;
    }

    static void AnotherLogic(int n){
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n&1;
            n = n >> 1;

            ans += last*base;
            base = base*5;
        }System.out.println(ans);
    }
}
