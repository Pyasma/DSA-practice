package Piyush.Recursion.Searching;

public class ArraySplit {
    // public int splitArray(int[] nums, int k) {
    //     int ans = splittingArray(nums,k);
    //     System.out.println(ans);
    //     //return spllitingArray(nums,k);   
    // }
    // what is this code doing
    
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;  
        int ans = splittingArray(nums,k);
        System.out.println(ans);
    }
    static int splittingArray(int[] arr, int k){
        int start = 0;
        int end = 0;
        for (int num : arr){
            start = Math.max(start, num);
            end += num; 
        }
        while (start < end){
            int mid = start + (end-start)/2;
            int count = counter(arr,mid);
            if (count > k){
                start = mid + 1;
            }else { 
                end = mid;
            }
        }return counter(arr,start);  
    }

    static int counter(int[] arr,int limit){
        int sum = 0;
        int num_count = 1;
        for (int num : arr){
            if (sum + num <= limit){
                sum += num;
            }else{
                num_count += 1;
                sum = num;
            }
        }return num_count;  
    }
}
