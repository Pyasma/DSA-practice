package Piyush.Assignment.Arrays.Easy;

public class Twelth {

    ///https://leetcode.com/problems/find-the-highest-altitude/
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(MaxAltitude(arr));
        // int[] gain = RunningSum(arr);
        // int max = arr[0];
        // for (int i = 1; i < gain.length; i++){
        //     if (max < gain[i]){
        //         max = gain[i];
        //     }
        // }System.out.println(max);
    }

    static int[] RunningSum(int[] arr){
        int n =  arr.length;
        int[] gain = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            gain[i] = sum+arr[i];
            sum += arr[i];
        }return gain;
    }


    static int MaxAltitude(int[] arr){
        int maxAlt = 0;
        int currentAlt = 0;

        for (int value : arr){
            currentAlt+= value;
            if (currentAlt > maxAlt){
                maxAlt = currentAlt;
            }
        }return maxAlt;
    } 
}
