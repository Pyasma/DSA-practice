package Piyush.Assignment.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class Nine {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] idx = {0,1,2,2,1};
        System.out.println(TargetArrayList(arr, idx));
    }

    static List<Integer> TargetArrayList(int[] nums, int[] index){
        List<Integer> list = new ArrayList<>();

        for (int i =0; i < nums.length; i++){
            list.add(index[i],nums[i]);
        }return list;
        /// .stream().mapToInt(Integer::intValue).toArray();    
    }

    static int[] TargetArray(int[] arr, int[] idx) {
        int[] target = new int[arr.length];
        int size = 0; // how many elements are actually filled
    
        for (int i = 0; i < arr.length; i++) {
            // shift elements right from size-1 down to idx[i]
            for (int j = size - 1; j >= idx[i]; j--) { 
                target[j + 1] = target[j];
            }
            // insert the element
            target[idx[i]] = arr[i];
            size++;
        }
        return target;
    }
}
