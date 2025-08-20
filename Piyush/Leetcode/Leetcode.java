package Piyush.Leetcode;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,4,6};
        System.out.println(formingPairfromMiddle(arr));
    }
    static int formingPairfromMiddle(int[] nums){
        Arrays.sort(nums);
        int start = 0;
        int n = nums.length;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        int max = 0;
        for (int i = 0; i < n/2; i++){
            int value = nums[mid-i] + nums[mid+i+1];
            if (value > max){
                max = value;
            }
        }return max;
    }
}
