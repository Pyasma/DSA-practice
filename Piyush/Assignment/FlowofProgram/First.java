package Piyush.Assignment.FlowofProgram;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //int n = 2023;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Input: ");
        int n = input.nextInt();
        System.out.println(LeapYear(n));
    }

    static boolean LeapYear(int n){
        // A leap Year is one Which is a Multiple of 400

        // Or Divisible by 4 and Not Divisible by 100

        if ((n%4) == 0 && (n%100) != 0){
            return true;
        }
        else if ((n%400) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
