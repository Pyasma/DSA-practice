package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class TwentyThree {
    public static void main(String[] args) {
        System.out.println(LeapYearOrNot(2000));
    }

    static boolean LeapYearOrNot(int n){
        if ((n % 400) == 0){
            return true;
        }else if ((n%100) == 0){
                return false;
        }else{
            return n%4 == 0;
        }
    }
}
