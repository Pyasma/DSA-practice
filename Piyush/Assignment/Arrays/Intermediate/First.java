package Piyush.Assignment.Arrays.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(mat));
    }
    static List<Integer> spiral(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> arr = new ArrayList<>();
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while (left <= right && top <= bottom){
            for (int col = left; col <= right; col++){
                arr.add(matrix[top][col]);
            }

            for (int row = top+1; row <= bottom; row++){
                arr.add(matrix[row][right]);
            }

            if (top < bottom){
                for (int col = right-1; col >= left; col--){
                    arr.add(matrix[bottom][col]);
                }
            }
            if (left < right){
                for (int row = bottom-1; row >= top; row--){
                    arr.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }return arr;
    }
}
