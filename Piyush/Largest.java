package com.Piyush;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter three numbers: ");
            
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("The largest number is: " + max);

            System.out.println("Do you want to enter another set of numbers? (y/n)");
        }   
            while (input.next().equalsIgnoreCase("y"));
    }    

}
