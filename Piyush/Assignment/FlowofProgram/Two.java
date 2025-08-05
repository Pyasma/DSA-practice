package Piyush.Assignment.FlowofProgram;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" a :");
        int a = input.nextInt();
        System.out.print(" b :");
        int b = input.nextInt(); 

        System.out.println(TwoSum(a, b));

    }

    static int TwoSum(int a, int b){
        return a+b;
    }
}
