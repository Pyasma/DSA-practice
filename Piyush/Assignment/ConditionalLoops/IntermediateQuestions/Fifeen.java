package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Fifeen {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println("nCr = " + NCR(n, r));
        System.out.println("nPr = " + NPR(n, r));
    }

    static double factorial(int n){
        if (n < 0){
            return -1;
        }
        double product = 1;
        while (n > 0){
            product *= n;
            n--; 
        }return product;    
    }

    static double NCR(int n, int r){
        double N = factorial(n);
        double R = factorial(r);
        double N_R = factorial(n-r);

        return N/(R*N_R);
    }

    static double NPR(int n, int r){
        double N = factorial(n);
        double N_R = factorial(n-r);

        return N/N_R;
    }
}
