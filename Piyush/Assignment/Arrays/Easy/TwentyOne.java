package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwentyOne {

    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twosumofnumbers2(arr, target)));
        //System.out.println(Arrays.toString(twosumofnumbers(arr, target)));
    }
    static int[] twosumofnumbers(int[] arr, int target){
        // 1st We can go through numbers using two loops 
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (i != j && arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
                    
            }
        }return new int[] {-1,-1};
    }

    // Steps 1 Make a hashmap 
    // Loop through the array 
    // Check if a element exist in the hashmap or not
    // if it doesn't exist add it 
    // create a remainder variable which will basically contain target-value in array
    // if remainder + value in hashmap = target we got the number

    static int[] twosumofnumbers2(int[] arr, int target){
        HashMap<Integer, Integer> has = new HashMap<>();  
        for (int i = 0; i < arr.length; i++){
            int remainder = target - arr[i];
            if (has.containsKey(remainder)){
                return new int[] {has.get(remainder),i};
            }else{
                has.put(arr[i], i);
            }
        }return new int[] {-1,-1};
    } 
}
