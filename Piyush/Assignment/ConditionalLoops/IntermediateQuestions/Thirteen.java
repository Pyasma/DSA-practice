package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Thirteen {
    public static void main(String[] args) {
        System.out.println(sum1(5));
        System.out.println(sum2(5));
    }
    static int sum1(int n){
        return n*((n+1)/2);
    }

    static int sum2(int n){
        int sum = 0;
        while (n > 0){
            sum += n;
            n--;
        }return sum;
    }
}
