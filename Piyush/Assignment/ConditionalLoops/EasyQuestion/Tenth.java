package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.println(PerimeterParallelogram(a, b));
    }

    static int PerimeterParallelogram(int a, int b){
        return 2*(a+b);
    }
}
