package Piyush.Maths;

public class OddorEven {
    public static void main(String[] args) {
        int n = 8;
        int ans = OddorEven(n);
        if (ans == 1){
            System.out.printf("Number %d is Odd",n);
        }else {
            System.out.printf("Number %d is Even",n);
        }
    }

    static int OddorEven(int n){
        if ((n & 1) == 1){
            return 1; 
        }else{
            return 0;
        }
    }
}
