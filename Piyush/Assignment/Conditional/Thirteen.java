package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.println(PerimeterRhombus(a));
    }

    static int PerimeterRhombus(int a){
        return 4*a;
    }
}
