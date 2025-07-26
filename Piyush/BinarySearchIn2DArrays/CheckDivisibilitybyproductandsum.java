package Piyush.BinarySearchIn2DArrays;

public class CheckDivisibilitybyproductandsum {
    public static void main(String[] args) {
        int n = 99;
        int sumofn = sum(n);
        int productofn = product(n);
        int ans = sumofn + productofn;
        if (n % ans == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    static int product(int n){
        int totalproduct = 1;
        while (n > 0){
            int remainder = n%10;
            totalproduct *= remainder;
            n = n/10;
        }return totalproduct;
    }

    static int sum(int n){
        int totalsum = 0;
        while (n > 0){
            int remainder = n%10;
            totalsum += remainder;
            n = n/10;
        }return totalsum;
    }
}
