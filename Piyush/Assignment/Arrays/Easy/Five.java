package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Shuffle(arr)); 
    }

    static String Shuffle(int[] arr){
        int n = arr.length/2;
        int i = 0;
        int[] ans = new int[arr.length];
        for (int val = 0; val < n; val++){
            ans[i++] = arr[val];
            ans[i++] = arr[val+n];
        }return Arrays.toString(ans);
    }
}
