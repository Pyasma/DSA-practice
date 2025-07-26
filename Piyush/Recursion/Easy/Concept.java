package Piyush.Recursion.Easy;

public class Concept {
    public static void main(String[] args) {
        increment(5);
    }
    static void increment(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        //increment(n--); (This Subtracts after the function end which creates infinite loop of 5)
        increment(--n); //(This) Subtracts before running the function again so it works fine
    }
}
