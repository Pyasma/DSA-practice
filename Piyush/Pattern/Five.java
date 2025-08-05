package Piyush.Pattern;

public class Five {
    public static void main(String[] args) {
        PatternFive2(5);
    }

    static void PatternFive(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }System.out.println();
        }
        for (int secrow = 1; secrow <= n; secrow++){
            for (int seccol = 1; seccol < n-secrow+1; seccol++){
                System.out.print("*");
            }System.out.println();
        }

    }
    static void PatternFive2(int n){
        for (int row = 1; row <= 2*n;row++){
            int totalcol = row > n ? 2*n-row: row; 
            for (int col = 1;col <= totalcol; col++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
