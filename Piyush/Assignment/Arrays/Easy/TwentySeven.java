package Piyush.Assignment.Arrays.Easy;

public class TwentySeven {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removingDuplicates(nums));
    }
    static int removingDuplicates(int[] nums){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i  < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                count++;
            }
        }return count;
    }
}
