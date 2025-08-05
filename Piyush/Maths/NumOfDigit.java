package Piyush.Maths;

public class NumOfDigit {
    public static void main(String[] args) {
        int n = 1;
        int ans = FindDigits(n);
        System.out.println(ans);
    }

    static int FindDigits(int n){
        return (int)(Math.log(n)/Math.log(2))+1; 
    }
}
