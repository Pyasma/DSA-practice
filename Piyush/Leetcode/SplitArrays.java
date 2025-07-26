package Piyush.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SplitArrays {
    public static void main(String[] args) {
        int[] nums = {175868717,841457609,-948571070,-747264172};
        List<Integer> primes = new ArrayList<>();
        List<Integer> nonprimes = new ArrayList<>();

        Arraymaker(nums, primes, nonprimes, 0);

        int prime_sum = sum(primes);
        int nonprime_sum = sum(nonprimes);

        System.out.println(Math.abs(prime_sum-nonprime_sum));
        
    }
    static int sum(List<Integer> list){
        int total = 0;
        for (int num : list){
            total += num;
        }
        return total;
    }
    static boolean checkPrime(int value){
        if (value < 2) return false;
        for (int i = 2; i*i <= value; i++){
            if (value % i == 0) return false;
        }
        return true;
    }
    static void Arraymaker(int[] arr, List<Integer> primes, List<Integer> nonprimes, int index){
        if (index >= arr.length) return;

        if (checkPrime(index) == true){
            primes.add(arr[index]);
        }else{
            nonprimes.add(arr[index]);
        }
        Arraymaker(arr, primes, nonprimes, index+1);    
        
    }
}
