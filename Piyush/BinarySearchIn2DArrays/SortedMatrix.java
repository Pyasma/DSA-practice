package Piyush.BinarySearchIn2DArrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 2;
        int[] ans = search(arr,target);
        System.out.println(ans);
    }
    // Search in the Rows Provided Between the Cols provided 


    static int[] binarysearch(int[] arr, int row, int colstart, int colend ,int target){
        while (colstart <= colend){
            int mid = colstart + (colend-colstart)/2;    
        }
    }

    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        // being cautious to check if matrix is indeed a m*n matrix or just a nested 1 array
        if (rows == 1){
            return new int[]{};
        }
    }