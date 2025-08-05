package Piyush.Pattern;

public class One {
    public static void main(String[] args) {
        PatternOne(5);
    }
    static void PatternOne(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("*");
            }System.err.println();
        }
    }

}
