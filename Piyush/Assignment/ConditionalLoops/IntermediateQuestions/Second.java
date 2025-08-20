package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("U : ");
        int U = sc.nextInt();
        System.out.println(ElectricityBill(U));
    }   

    static int ElectricityBill(int U){
        if (0 < U && U <= 100){
            return U*10;
        }if (100 < U && U <= 200){
            return U*15;
        }if (200 < U && U <= 250){
            return U*20;
        }return -1;
    }
}

