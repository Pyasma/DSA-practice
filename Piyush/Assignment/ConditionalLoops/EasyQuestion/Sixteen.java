package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("r :"); 
        int r = sc.nextInt();
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.println(VolumeCylinder(r, h));  
    }

    static double VolumeCylinder(int r, int h){
        return Math.PI*power(r,2)*h;
    }

    static int power(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp & 1) == 1){
                result *= base;
            }base *= base;
            exp >>= 1;
        }return result;
    }
}
