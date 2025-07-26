package com.Piyush;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*   
        [
            [1,2,3]
            [4,5,6]
            [7,8,9]
        ]
            */
        Scanner in = new Scanner(System.in);
        int[][] numbers = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = in.nextInt();
            }
        }
        // System.out.print(Arrays.deepToString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                // System.out.print(numbers[i][j] + " ");
            }
            // System.out.println();
        }
        for (int[] i: numbers){
            System.out.println(Arrays.toString(i));
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }
    
}
