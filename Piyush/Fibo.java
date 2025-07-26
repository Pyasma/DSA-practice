package com.Piyush;
import java.util.Scanner;

public class Fibo{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0){
            System.out.print(a + " ");
            int temp = a+b;
            a = b;
            b = temp;
            n--;
        }
        
    
    }
}
