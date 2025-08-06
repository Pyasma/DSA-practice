package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        while (true) {
            System.out.print("n :");
            int n = sc.nextInt(); 
            if (n == 0){
                System.out.println(sum);
                break;
            }sum += n;   
        }
    }
}
