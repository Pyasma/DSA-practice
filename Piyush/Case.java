package com.Piyush;

import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
    }
}

