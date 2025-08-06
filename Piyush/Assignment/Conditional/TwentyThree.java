package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt(); 
        Factors(n);
    }

    static void Factors(int n){
        for (int i = 1; i*i <= n; i++){
            if ((n % i) == 0){
                System.out.println(i);
            }
        }
    }
}
