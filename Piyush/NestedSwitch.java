package com.Piyush;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (1) {
            case 1:
                System.out.println("This is outer switch");
                switch (2) {
                    case 2:
                        System.out.println("This is inner switch");
                        break;
               }
                break;

            case 3:
                System.out.println("This is 3 outer switch");
                switch (4) {
                    case 4:
                        System.out.println("This 4 is inner switch");
                        break;
                }
                break;
            case 4: 
                System.out.println("This 4 is outer switch");
                switch (5) {
                    case 5:
                        System.out.println("This 5 is inner switch");
                        break;
                }
                break;
        
            
        }

    }
    
}

