package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class TwentySix {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(addingOne(digits)));
    }
    static int[] addingOne(int[] digit){
        int[] result = new int[digit.length+1];
        int n = digit.length-1;
        for (int i = n; i >= 0; i--){
            digit[i] += 1;
            if (digit[i] < 10){
                return digit;
            }
            digit[i] = 0;
        }result[0] = 1;
        return result;
    }
}
