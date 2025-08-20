package Piyush.Assignment.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class TwentyTwo {
    public static void main(String[] args) {
        System.out.println();
    }

    static List<Integer> LuckiestNumber(int[][] arr){
        // Lucky number definition:
        // - It is the minimum element in its row
        // - AND the maximum element in its column
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            // Step 1: Find the minimum element in the current row
            int rowmin = arr[i][0];
            int colIndex = 0;
            for (int j = 1; j < arr[i].length; j++){
                if (arr[i][j] < rowmin){
                    rowmin = arr[i][j];
                    colIndex = j; // record column of row minimum
                }   
            }

            // Step 2: Check if this row minimum is also the maximum in its column
            boolean IsLucky = true;
            for (int k = 0;  k < arr.length; k++){
                if (arr[k][colIndex] > rowmin){
                    IsLucky = false;
                    break;
                }
            }

            // Step 3: If both conditions hold, it's a lucky number
            if (IsLucky){
                ans.add(rowmin);
            }
        }
        return ans; 
    }
}

}
