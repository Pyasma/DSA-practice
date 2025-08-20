package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Sixth {
    public static void main(String[] args) {
        int a = 1000;
        int b = 5;
        System.out.println(CommissionPercentage(a, b));
    }
    // Sales Commission = Commission Rate* Sales Revenue;

    static double CommissionPercentage(int CommissionRate, int SalesRevenue){
        return CommissionRate*(SalesRevenue/100.0);
    }
}
