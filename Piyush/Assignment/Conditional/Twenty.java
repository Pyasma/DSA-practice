package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.println(TotalAreaCube(a));
    }

    static int TotalAreaCube(int a){
        return 6*power(a,2);
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
