package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("p :");
        int p = sc.nextInt();
        System.out.print("q :");
        int q = sc.nextInt();
        System.out.println(AreaRhombus(p, q));
    }

    static double AreaRhombus(int p, int q){
        return p*q*(0.5);
    }
}
