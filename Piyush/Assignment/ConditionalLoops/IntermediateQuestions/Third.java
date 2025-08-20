package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.println(Average(n));
    }

    static int Average(int n){
        int sum = 0;
        int i = 0;
        while (i <= n){
            sum+= i;
            i++;
        }return sum/n;
    }
}
