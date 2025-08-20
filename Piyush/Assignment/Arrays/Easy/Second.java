package Piyush.Assignment.Arrays.Easy;

public class Second {
    public static void main(String[] args) {
        
    }
    //https://leetcode.com/problems/concatenation-of-array/description/

    static int[] ConcatentionArray(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n*2];

        for (int i = 0; i < 2*n; i++){
            if (i < n){
                newArr[i] = (arr[i%n]);
                // using A modulo operator to Copy elements again
                /*First half of newArr 
                (i = 0 to 2):

                i = 0 → i % n = 0 % 3 = 0 → newArr[0] = arr[0] = 1

                i = 1 → i % n = 1 % 3 = 1 → newArr[1] = arr[1] = 2

                i = 2 → i % n = 2 % 3 = 2 → newArr[2] = arr[2] = 3

                Second half of newArr (i = 3 to 5):

                i = 3 → i % n = 3 % 3 = 0 → newArr[3] = arr[0] = 1

                i = 4 → i % n = 4 % 3 = 1 → newArr[4] = arr[1] = 2

                i = 5 → i % n = 5 % 3 = 2 → newArr[5] = arr[2] = 3

                Result: [1, 2, 3, 1, 2, 3]*/
                
            }
        }return newArr;
    }
}
