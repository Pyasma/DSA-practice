package Piyush.Pattern;

public class Three {
    public static void main(String[] args) {
        Patternthree(5);
    }

    static void Patternthree(int n){
        for (int row = 1; row <= n;row++ ){
            for (int col = 1 ; col <= n-row+1; col++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
