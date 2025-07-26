package com.Piyush;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = in.nextInt();
        // boolean output = isPrime(n); 
        // System.out.println(output);
        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    // 3 digit Armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum += rem*rem*rem;
            n = n / 10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }

    
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}