package com.Piyush;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 67;
        arr[3] = 89;
        arr[4] = 90;
        // System.out.println("The array is: "+ arr[4]);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        // for (int i:arr) {
        //     System.out.print (i+ " ");
        // } 
        // System.out.print(Arrays.toString(arr));

        String[] name = new String[5];
        for (int i = 0; i < name.length; i++) {
            name[i] = in.next();
        }
        System.out.print(Arrays.toString(name));

        name[3] = "Piyush";
        System.out.print(Arrays.toString(name));


    }
}
