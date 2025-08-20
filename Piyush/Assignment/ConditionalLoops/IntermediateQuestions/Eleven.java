package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Principal = sc.nextDouble();
        double Rate = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(CompoundInterest(Principal, Rate, n));
    }

    static double CompoundInterest(double Principal, double rate, int n){
        double rateper = rate/100.0;
        return (Principal*power((1+rateper),n))-Principal;
    }

    static double power(double base, int exp){
        double result = 1;
        while (exp > 0){
            if ((exp&1) == 1){
                result *= base;
            }base*= base;
            exp >>= 1;
        }return result;

    }
}
