package Piyush.Pattern;

public class Seventeen {
    public static void main(String[] args) {
        PatternSeventeen(5);
    }
    static void PatternSeventeen(int n){
        for (int row = 1; row <= 2*n; row++){
            int c = row >n ? 2*n-row:row;
            for (int spaces = 1; spaces <= n-c; spaces++){
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--){
                System.out.print(col);
                System.out.print(" ");
            }
            for (int col = 2; col <= c; col++){
                System.out.print(col);
                System.out.print(" ");
            }System.out.println(" ");
        }
    }
}
