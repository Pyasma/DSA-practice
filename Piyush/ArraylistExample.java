package com.Piyush;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        list.add(279);
        list.add(272);
        list.add(27934);
        list.add(27946);

        System.out.println(list.contains(279)); 
        System.out.println(list);
        list.set(2,8000); 
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list); 

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }   
}

