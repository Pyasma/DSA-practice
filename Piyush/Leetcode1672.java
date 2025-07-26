package com.Piyush;

public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] acc = {{1,2,3},{3,2,1}};
        int[][] acc2 = {{1,5},{7,3},{3,5}};
        int[][] acc3 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(acc));
        System.out.println(maximumWealth(acc2));
        System.out.println(maximumWealth(acc3));
        
    }
    static int maximumWealth(int[][] accounts){
        int CurrentMaximum = Integer.MIN_VALUE;
        for (int[] account : accounts){
            int sum = 0;
            for (int money : account){
                sum += money;
            }
            if (sum > CurrentMaximum){
                CurrentMaximum = sum; 
        }
    }
        return    CurrentMaximum;
    }
}
