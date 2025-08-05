package Piyush.Pattern;

public class Thirtyone {
    public static void main(String[] args) {
        PatternThrityOne(4);
    }
    static void PatternThrityOne(int n){
        n = 2*n;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                // Special Method Distance from the all sides up down left right
                int minDistance = Math.min(Math.min(row - 1, col - 1),
                                           Math.min(n- row, n - col));
                System.out.print(n - minDistance);
            }System.out.println(" ");

            // for (int col = 1; col <= 2*n; col++){
            //     System.out.print(n);
            // }System.out.println("");
        }
    }
}
