package Piyush.Assignment.FirstJava;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOrOdd(n);
        EvenOrOdd2(n);
    }

    static void EvenOrOdd(int n){
        if ((n % 2) == 0){
            System.out.println("It's Even");
        }else{
            System.out.println("It's Odd");
        }
    }

    static void EvenOrOdd2(int n){
        // ODD number will be only 10001->1 or any number having 1 in the Least Significant Set
        // 100001 & 000001 = 1
        if ((n&1) == 1){
            System.out.println("It's Odd");
        }else{
            System.out.println("It's Even");
        }
    }
}
