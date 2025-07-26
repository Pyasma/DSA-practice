package com.Piyush;

public class Leetcode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char[] letters2 = {'c', 'f', 'j','a','b'};
        char target2 = 'c';

        char ans = Find_Smallest_Letter_Greater_than_the_Target(letters, target); 
        System.out.println(ans);
    }
    static char Find_Smallest_Letter_Greater_than_the_Target(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
         
    }
}
 