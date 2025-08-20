package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.println(Product(n) - sum(n));
    }

    static int Product(int n){
        int product = 1;
        while (n > 0){
            int remainder = n%10;
            product *= remainder;
            n /= 10;
        }return product;
    }

    static int sum(int n){
        int sum = 0;
        while (n > 0){
            int remainder = n%10;
            sum += remainder;
            n /= 10;
        }return sum;
    }
}
