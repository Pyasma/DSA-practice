package com.Piyush.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 20; // Example input
        int result = fibonaccirecursion(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        
    }
    static int fibonaccirecursion(int n){
        if (n <= 1){
            return n;
        }
        return fibonaccirecursion(n-1) + fibonaccirecursion (n-2);
    }
}
