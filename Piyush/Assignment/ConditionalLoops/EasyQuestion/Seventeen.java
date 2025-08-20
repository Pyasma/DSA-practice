package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("r :");
        int r = sc.nextInt();
        System.out.println(VolumeSphere(r));
    }

    static double VolumeSphere(int r){
        return (4.0/3)*Math.PI*power(r,3);
    }

    static int power(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp&1) == 1){
                result *= base;
            }base *= base;
            exp >>= 1; 
        }return result;
    }
}
