package Piyush.Assignment.FirstJava;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String o = sc.next();
        int ans = MiniCalculator(a, b, o);
        System.out.println(ans);
    }

    static int MiniCalculator(int a, int b, String  o){
        if (o.equals("+")){
            return a+b;
        }
        if (o.equals("-")){
            return a-b;
        }
        if (o.equals("*")){
            return a*b;
        }
        if (o.equals("/")){
            return a/b;
        }return -1;
    }
}
