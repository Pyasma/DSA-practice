package Piyush.Assignment.FlowofProgram;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Enter next Number or 'x' ");
            String input = sc.next();
            if (input.equals("x")){
                break;
            }else{
                // Convert String to Integer
                int n = Integer.parseInt(input);
                sum += n;
            }
        }System.out.println(sum);
    }
}
