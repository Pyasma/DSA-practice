package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("l :");
        int l = sc.nextInt();
        System.out.print("w :");
        int w = sc.nextInt();
        System.out.println(PerimeterRectangle(l, w));
    }
    static int PerimeterRectangle(int l, int w){
        return 2*(l+w);
    }
}
