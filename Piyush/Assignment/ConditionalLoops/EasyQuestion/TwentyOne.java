package Piyush.Assignment.ConditionalLoops.EasyQuestion;

import java.util.*;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
    static int Fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }return b;
    }
}
