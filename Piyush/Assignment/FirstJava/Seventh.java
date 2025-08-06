package Piyush.Assignment.FirstJava;

public class Seventh {
   public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibonacci(n));
        System.out.println(RecursionFibonacci(n));
   }
   
   static int Fibonacci(int n){
        int a= 0;
        int b = 1; 
        for (int i = 0; i < n; i++){
            // Stairs Method
            int temp = a;
            a = a+b;
            b = temp;
        }return a;
   }

   static int RecursionFibonacci(int n){
    if (n == 0){
        return 0; 
    }
    if (n == 1){
        return 1;
    }
    return RecursionFibonacci(n-1) + RecursionFibonacci(n-2);
    }
}
