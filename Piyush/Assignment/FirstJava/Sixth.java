package Piyush.Assignment.FirstJava;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Conversion(a));
    }

    static int Conversion(int a){
        return a*(int)(87.80);
    }
}
