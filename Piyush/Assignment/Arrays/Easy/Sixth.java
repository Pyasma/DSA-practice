package Piyush.Assignment.Arrays.Easy;
import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        int n = arr.length;
        System.out.println(KidsWithMaxCandies(arr,n, extra));
    }

    /// Max Candies
    /// 
    /// ///https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1729831120/

    static int MaxCandies(int[] arr, int n){
        int max = arr[0];
        for (int i =1; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }return max;
    }

    static String KidsWithMaxCandies(int[] arr, int n, int extra){
        int max = MaxCandies(arr, n);
        boolean[] list = new boolean[n];
        for (int i = 0; i < n; i++){
            if (arr[i] + extra < max){
                list[i] = false;
            }
            else{
                list[i] = true; 
            }
        }return Arrays.toString(list);
    }
}
