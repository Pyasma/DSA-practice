package Piyush.Assignment.FlowofProgram;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        LCM(a, b);
    }

    static int HCF(int a, int b){
        while (b > 0){
            // Modulo until b reaches Zero and return a;
            int temp = b;
            b = a%b;
            a = temp;
        }System.out.printf("This is HCF %d\n", a);
        return a;
    }

    static void LCM(int a, int b){
        int ans = ((a*b)/HCF(a,b));
        System.out.printf("This is LCM %d" ,ans);
    }
}
