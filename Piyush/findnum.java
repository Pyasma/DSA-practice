package com.Piyush;

import java.util.Scanner;
public class findnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter a number to find: ");
        int num = in.nextInt();
        // String str = String.valueOf(n);
        // String str2 =  String.valueOf(num);

        int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == str2.charAt(0)) {
        //         count++;
            // }
        
            while (n > 0) {
                int rem = n% 10;
                if (rem == num) {
                    
                    count++;
                }
                n = n/10;
            }
        System.out.print("The number of times " + num + " appears in  is: " + count);
        }
        

        
    }
