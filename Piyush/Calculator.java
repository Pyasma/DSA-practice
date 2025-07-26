package com.Piyush;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op ==   'x' || op == 'X'){
                System.out.println("Exiting...");
                break;
            }
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    System.out.println(num1 + num2);
                }
                if (op == '-'){
                    System.out.println(num1 - num2);
                }
                if (op == '*'){
                    System.out.println(num1 * num2);
                }
                if (op == '/'){
                    if (num2 != 0){
                        System.out.println(num1 / num2);
                    }
                }
                if (op == '%'){
                    System.out.println(num1 % num2);
                }
            }   
            else {
                System.out.println("Invalid Operation");
            }

        } 
    }   
}
