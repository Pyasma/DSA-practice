package Piyush.Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println("Printing from N to 1:");
        printNto1(6);
    }
    static void printNto1(int n){
        if (n < 1){
            return;
        }
        
        System.out.println(n);
        printNto1(n-1);

    }
}
