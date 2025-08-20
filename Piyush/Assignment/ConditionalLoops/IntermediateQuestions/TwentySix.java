package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOFNumbers(sc);
    }
    static void SumOFNumbers(Scanner sc){
        int SumPos = 0;
        int SumNeg = 0;
        int SumPosOdd = 0;
        while (true){
            int n =  sc.nextInt();
            if (n == 0) break;
            if (n > 0 && (n % 2) == 0){
                SumPos += n;
            }else if (n < 0){
                SumNeg += n;
            }else if (n > 0 && (n%2) != 0){
                SumPosOdd += n;
            }
        }System.out.printf("SumPos: %d, SumNeg: %d, SumPosOdd: %d\n", SumPos, SumNeg, SumPosOdd);
    }
}
