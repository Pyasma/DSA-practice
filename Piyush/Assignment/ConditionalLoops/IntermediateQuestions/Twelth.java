package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class Twelth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Average(N,sc));
    }
    static double Average(int n, Scanner sc){
        double sum = 0;
        int count = n;
        while (n > 0){
            int Marks = sc.nextInt();
            sum += Marks;
            n--;
        }return sum/(double)count;
    }
}
