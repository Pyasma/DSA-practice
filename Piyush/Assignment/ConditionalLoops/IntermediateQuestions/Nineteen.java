package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Nineteen {
    public static void main(String[] args) {
        System.out.println(HCF(24, 36));
    }
    // Important
    static int HCF(int a, int b){
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }return a;
    }
}
