package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Twelth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.println(PerimeterSquare(a));
    }

    static int PerimeterSquare(int a){
        return 4*a;
    }
}
