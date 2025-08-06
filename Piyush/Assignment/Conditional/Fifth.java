package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.println(AreaParallelogram(h, b));
        
    }

    static int AreaParallelogram(int h, int b){
        return h*b;
    }
}
