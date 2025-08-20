package Piyush.Assignment.Functions;

import java.util.ArrayList;
    import java.util.Arrays;

public class Thirteen {
    public static void main(String[] args) {
        System.out.println(PrimesInRange(10, 30));
    }
    static boolean IsPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0) return false;
        }return true;
    }

    static ArrayList<Integer> PrimesInRange(int a, int b){
        ArrayList<Integer> list = new  ArrayList<>(); 
        for (int i = a; i < b; i++){
            if (IsPrime(i) == true){
                list.add(i);
            }
        }return list;
    }
}
