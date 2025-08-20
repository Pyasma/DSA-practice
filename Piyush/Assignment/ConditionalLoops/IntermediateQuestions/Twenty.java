package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Twenty {
    public static void main(String[] args) {
        System.out.println(LCM(18, 24));
    }
    static int HCF(int a, int b){
        while (b > 0){
            int temp = b;
            b = a%b;
            a = temp;
        }return a;
    }
    static int LCM(int a, int b){
        return (a*b)/HCF(a,b);
    }
}
