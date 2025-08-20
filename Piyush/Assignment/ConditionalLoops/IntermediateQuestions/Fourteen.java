package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Fourteen {
    public static void main(String[] args) {
        System.out.println(Armstrong(153));
    }

    static int power(int base, int exp){
        int result = 1;
        while (exp > 1){
            if ((exp&1) == 1) result *= base;
            base *= base;
            exp >>= 1;
        }return result;
    }

    static int power2(int base, int exp){
        int result = 1;
        while (exp > 1){
            result *= base;
            exp--;
        }return result;
    }

    static boolean Armstrong(int n){
        int sum = 0;
        int original = n;
        int len = String.valueOf(n).length();
        while (n >= 0){
            int remainder = n%10;
            sum += power(remainder,len);
            n/=10;
        }return sum == original;
    }
}
