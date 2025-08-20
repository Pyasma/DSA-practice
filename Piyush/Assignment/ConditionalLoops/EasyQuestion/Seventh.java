package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.println(AreaEquilateralTriangle(a));
        
    }

    static double AreaEquilateralTriangle(int a){
        return (Math.sqrt(3)/4)*Math.pow(a,2);
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
