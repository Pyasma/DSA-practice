package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }

    static int sum(int a, int b){
        return a+b;
    }
}
