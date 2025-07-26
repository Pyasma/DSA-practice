package com.Piyush;

import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
        
    }
}
