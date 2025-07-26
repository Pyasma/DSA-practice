package com.Piyush;

public class ColNofixed {
    public static void main(String[] args) {
        /*
         [
            [2,3,4]
            [5,6]
            [1,8,7]
         ]
        */
        // Scanner in = new Scanner(System.in);

        int[][] arr = {
            {2,3,4},
            {5,6},
            {1,8,7}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        } 
    }
    
}
