package Piyush.Assignment.Arrays.Easy;

public class Third {
    public static void main(String[] args) {
        
    }
    //https://leetcode.com/problems/running-sum-of-1d-array/

    static int[] RunningSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            // summing the arr and updating it in sum
            sum += arr[i];
            ans[i] = sum;
        }return ans;
    }
}
