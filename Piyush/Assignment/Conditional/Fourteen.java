package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("r :");
        int r = sc.nextInt();
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.println(VolumeCone(r, h));
    }
    static double VolumeCone(int r, int h){
        return Math.PI*power(r,2)*(h/3);
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
