package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("r :");
        int r = sc.nextInt();
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.println(AreaCyclinder(r, h));   
    }
    static double AreaCyclinder(int r, int h){
        return 2*Math.PI*r*h;
    }
}
