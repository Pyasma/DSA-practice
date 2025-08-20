package Piyush.Assignment.Functions;

public class Seventh {
    public static void main(String[] args) {
        prime(37);
    }

    static void prime(int n){
        if (n <= 1){
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= (double)n*0.5;i++){
            if ((n%i) == 0){
                System.out.println("Not Prime");
                return;
            }
        }System.out.println("It's Prime");
    }
}
