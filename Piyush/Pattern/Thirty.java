package Piyush.Pattern;

public class Thirty {
    public static void main(String[] args) {
        PatternThirty(5);
    }

    static void PatternThirty(int n){
        for (int row = 1; row <= n; row++){
            int numofspaces = n-row;
            for (int space= 1; space <= numofspaces; space++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col);
                System.out.print(" ");
            }
            for (int col = 2; col  <= row; col++){
                System.out.print(col);
                System.out.print(" ");
            }System.out.println(" ");
        }
    }
}
