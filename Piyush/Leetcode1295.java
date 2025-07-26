package com.Piyush;


// Find Numbers with Even Number of Digits

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(FindEven(arr));
        System.out.println(digits2(1234));
    }
    static int FindEven(int[] arr){
        int count = 0;
        for (int i: arr){
            if (Even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean Even(int num){
        int numberofdigits = Digits(num);
        return  numberofdigits % 2 == 0;
    }

    static int digits2(int num) { 
        if (num < 0) {
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1; 
    }

    static int Digits(int num){ 
        if (num < 0){
            num *= -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;

        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
