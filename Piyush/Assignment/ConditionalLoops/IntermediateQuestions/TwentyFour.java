package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class TwentyFour {
    public static void main(String[] args) {
        System.out.println(SumofDigits(10012));
    }

    static int SumofDigits(int n){
        int sum = 0;
        while (n > 0){
            int remainder = n%10;
            sum += remainder;
            n/=10;
        }return sum;
    }
}
