package com.Piyush;

public class Overloading {
    public static void main(String[] args) {   

        fun(19);
        fun("Piyush"); 
        System.out.println(sum(89, 98)); 
    }
// When two functions have same name but different parameters and arguments 
     static void fun(int a) {

        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;   
    }

    
}
