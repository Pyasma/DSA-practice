package Piyush.Assignment.Functions;

public class Second {
    public static void main(String[] args) {
        EvenOrOdd(8);
    }

    static void EvenOrOdd(int n){
        n = Math.abs(n);
        if ((n%2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
