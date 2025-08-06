package Piyush.Assignment.Conditional;

import java.util.ArrayList;
import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        int temp = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("n : ");
            int n = sc.nextInt();

            if (n == 0){
                System.out.println(temp);
                break;
            }else if (n > temp){
                temp = n;
            }else{
                System.out.println(0);
            } 

        }
    }
}
