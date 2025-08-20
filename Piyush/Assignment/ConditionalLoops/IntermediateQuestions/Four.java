package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Four {
    public static void main(String[] args) {
        int value = 1500;
        int Disc = 10;
        System.out.println(Discount(value, Disc));
    }

    static double Discount(int value, int percentage){
        double Off = (percentage/100.0)*value; 
        return value-Off;
    }
}
