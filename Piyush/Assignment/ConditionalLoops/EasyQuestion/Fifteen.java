package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("B :");
        int B = sc.nextInt();
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.println(VolumePrism(B, h));
    }

    static int VolumePrism(int B, int h){
        return B*h;
    }
}
