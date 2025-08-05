package Piyush.Maths;

public class FindingValueInThriceArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,4,2,3,1};
        int ans = numberAppearing3Times(arr);
        System.out.println(ans);
    }
    static int numberAppearing3Times(int[] arr){
        int result = 0;

        for (int i = 0; i < 32; i++){
            // We are going from 0 to 31 Each loop we will Get the Sum for each bit postion
            int sum = 0;

            for (int num : arr){
                if (((num >> i)&1) == 1){
                    // This will move the set bit value to right by ith position if and we will the check the right most bit and & it with 1 if we receive 1
                    sum++;  
                    // if We receive 1 we increase the sum
                }
                // After loop end we will check if the sum%3 or by any odd number or not
            }if (sum%3 != 0){
                result |= (1 << i);
            }
        }return result;
    }
}
