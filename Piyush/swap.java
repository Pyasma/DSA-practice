package com.Piyush;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        a,b = swap(a,b);
        SwapFunc(5, 2);
    }
    static void SwapFunc(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swapped numbers are: " + num1 + " " + num2);
    } 
    
}
