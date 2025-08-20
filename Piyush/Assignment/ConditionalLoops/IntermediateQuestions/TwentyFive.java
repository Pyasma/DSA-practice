package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class TwentyFive {
    public static void main(String[] args) {
        FindDays(31);
    }

    static void FindDays(int n){
        int count = 0;
        for (int day = 1; day <= 31; day++){
            if (day%2 == 0){
                count++;
            }
        }System.out.println(count);

    }
}
