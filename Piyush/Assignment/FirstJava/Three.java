package Piyush.Assignment.FirstJava;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int ans = SimpleInterest(P, T, R);
        System.out.println(ans);
    }

    static int SimpleInterest(int P, int T, int R){
        int S_I = (P*T*R)/100;
        return S_I;
    }
}
