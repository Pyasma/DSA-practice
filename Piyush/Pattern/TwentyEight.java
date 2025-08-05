package Piyush.Pattern;

public class TwentyEight {
    public static void main(String[] args) {
        PatternTwoEight(5);
    }

    static void PatternTwoEight(int n){
        for (int row = 1; row <= 2*n; row++){
            int totalcol = row > n ? 2*n-row : row;
            int numofSpaces = n-totalcol ;
            for (int space = 1; space <= numofSpaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totalcol; col++){
                System.out.print("*");
                System.out.print(" ");
            }System.out.println(" ");
        }
    }
}
