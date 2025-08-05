package Piyush.Pattern;

public class Two {
    public static void main(String[] args) {
        patterntwo(5);
    }
    static void patterntwo(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
