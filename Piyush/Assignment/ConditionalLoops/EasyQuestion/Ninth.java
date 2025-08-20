package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.println(PerimeterEquilateralTriangle(a));
        
    }

    static double PerimeterEquilateralTriangle(int a){
        return 3*a;
    }

    static int power(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp & 1 ) == 1){
                result *= base;
            }base *= base;
            exp >>= 1;
        }return result;
    }
}
