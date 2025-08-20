package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class TwentyTwo {
    public static void main(String[] args) {
        System.out.println(PerfectNum(6));
    }
    static boolean PerfectNum(int n){
        int i = 1;
        int sum = 0;
        while (i <= n/2){
            if ((n%i) == 0){
                sum+= i;
                i++;
            }else{
                i++;
            }
        }return n == sum;
    }
}