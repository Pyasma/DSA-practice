package Piyush.Pattern;

public class Four {
    public static void main(String[] args) {
        PatternFour(5);
    }

    static void PatternFour(int n){
        for (int row = 1; row <= n;row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }System.out.println();
        }
    }
}
