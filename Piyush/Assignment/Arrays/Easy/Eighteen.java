package Piyush.Assignment.Arrays.Easy;

import java.util.ArrayList;


public class Eighteen {
    // 
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList<Integer> ans = value2(num, k);
        System.out.println(ans);
    }

    static ArrayList<Integer> value2(int[] num, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 0;
        int i = num.length-1;
        while (k > 0 || carry > 0 || i >= 0){
            int sum=carry;
            
            if (i >= 0){
                sum += num[i];
                i--;
            }

            if (k > 0){
                sum += k%10;
                k/=10;
            }
            arr.add(sum%10);
            carry = sum/10;
        }return arr;
        // for (int idx = i; idx >= 0; idx--){

        // }
    }

}
