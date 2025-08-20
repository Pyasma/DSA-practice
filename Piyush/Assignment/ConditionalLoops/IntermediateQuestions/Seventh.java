package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Seventh {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        System.out.println(Power(a,b));
    }   

    static int Power(int base, int exp){
        int result = 1;
        while (exp > 0){
            result *= base;
            exp--;
        }return result;
    }

    static int Power(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp&1) == 1) result *= base;
            base *= base;
            exp >>= 1;
        }return result; 
    }
}
