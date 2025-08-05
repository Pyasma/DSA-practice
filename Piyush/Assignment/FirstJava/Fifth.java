package Piyush.Assignment.FirstJava;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(FindMaximum(a, b));
    }

    static int FindMaximum(int a,int b){
        if (a >= b){
            return a;
        }else{
            return b;
        }
    }
}
