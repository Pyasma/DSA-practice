package com.Piyush;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("Piyush","Kumar");
        multiple(1,2, "Piyush","Kumar");
        
    }
    static void multiple(int a, int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }

}
