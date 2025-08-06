package Piyush.Assignment.FirstJava;
import java.util.*;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input :");
        int n = sc.nextInt();
        System.out.println(Armstrong(n));
    }

    static boolean Armstrong(int n){
        int len = String.valueOf(n).length();
        int original = n;
        int sum = 0;
        while (n>0){
            int remainder = n%10;
            // sum += Math.pow(remainder,len);
            sum += power2(remainder, len);
            n /= 10;
        }return sum == original;
    }
    

    static int power(int base, int exp){
        int result = 1;
        while (exp > 0){
            result *= base;
            exp--;
        }return result;
    }

    static int power2(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp & 1) == 1) result *= base; // We are updating result if power is odd (Exponentiation method)
            base *= base;
            exp >>= 1;
        }return result;
    }
}
