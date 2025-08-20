package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("Percentage : ");
        int Percentage = sc.nextInt();
        System.out.println(DeprciationValue(n, Percentage));
    }

    static double DeprciationValue(int n, int Percentage){
        double value = (Percentage/100.0)*n;
        return n-value;
    }
}
