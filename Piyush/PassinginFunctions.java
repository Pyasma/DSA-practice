package com.Piyush;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr)); 
        change(arr);
        System.out.println(Arrays.toString(arr));  
    } 

    static void change(int[] arr) {
        arr[0] = 98;
    }
}
