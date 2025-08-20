package Piyush.Assignment.Arrays.Easy;

import com.Piyush.FindPeak;

public class Seventh {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(Findpairs(arr));
    }   
    //https://leetcode.com/problems/number-of-good-pairs/description/

    static int Findpairs(int[] arr){
        int n = arr.length;
        int count= 0;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j<n;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }return count;
    }
}
