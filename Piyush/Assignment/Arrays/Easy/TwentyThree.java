package  Piyush.Assignment.Arrays.Easy;

public class TwentyThree {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; 
        System.out.println(maximumSubArray(nums));
        System.out.println(kadaneAlgorithm(nums));
    }
    static int maximumSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i;j < nums.length; j++){
                sum += nums[j];
                if (sum > max){
                    max = sum;
                }
            }
        }return max;
    }

    static int kadaneAlgorithm(int[] arr){
        int maxending = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            maxending = Math.max(maxending + arr[i], arr[i]);

            max = Math.max(max,maxending);
        }return max;
    }
}
