package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class First {
    // https://leetcode.com/problems/build-array-from-permutation/
    // This is the Questions
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Permutation(arr));
    }

    // ... This Method is Creating a new Array and Storing All the new values in it
    static String Permutation(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            ans[i] = arr[arr[i]];
        }return Arrays.toString(ans);
    }
}
