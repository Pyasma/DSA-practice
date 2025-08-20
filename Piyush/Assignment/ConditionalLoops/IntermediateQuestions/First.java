package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }

    static int Factorial(int n){
        int product = 1;
        while (n > 0){
            product*=n;
            n--;
        }return product;
    }
}
