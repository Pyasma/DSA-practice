package Piyush.Assignment.Functions;

public class Twelth {
    public static void main(String[] args) {
        System.out.println(PythagoreanTriplet(2, 2, 3));
    } 
    
    static int power(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp&1) == 1) result *= base;
            base *= base;
            exp>>=1;
        }return result;
    }
    
    static boolean PythagoreanTriplet(int A, int B, int C){
        int a = power(A,2);
        int b = power(B,2);
        int c = power(C,2);
        return a+b == c; 
    }
}
