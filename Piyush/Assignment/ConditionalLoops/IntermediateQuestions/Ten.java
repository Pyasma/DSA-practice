package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(CGPA(N));
    }

    static double CGPA(int Num){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("TotalCredits");
        int Total = sc.nextInt();
        while (Num > 0){
            System.out.print("Grade");
            int Grade = sc.nextInt();
            System.out.print("Credits");
            int Credits = sc.nextInt();
            

            sum += Grade*Credits;
            Num--;

        }return (double)sum/Total;
    }
}
