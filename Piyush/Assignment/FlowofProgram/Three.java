package Piyush.Assignment.FlowofProgram;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("n :");
        int b = sc.nextInt();
        MultiplicationTable(a, b);
    }

    static void MultiplicationTable(int a,int n){
        int i = 1;
        while (i <= n){
            System.out.println(i*a);
            i++;
        }
    }
}
