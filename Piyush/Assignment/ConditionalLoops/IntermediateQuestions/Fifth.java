package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        
        double distance = Distance(x1, y1, x2, y2);
        System.out.println("Distance between the two points: " + distance);
    }

    static double Distance(int a1, int b1, int a2, int b2){
        int x = a1-a2;
        int y = b1-b2;
        return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }
}
