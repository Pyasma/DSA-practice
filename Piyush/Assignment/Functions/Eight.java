package Piyush.Assignment.Functions;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Grade(n,sc));
    }
    static int Grade(int n, Scanner sc){
        int totalMarks = 0;
        for (int i = 0; i <= n; i++){
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        int percentage =  (totalMarks/n*100)*100;

        switch ((int) percentage/10){
            case 9:
                System.out.println("Your grade is AA");
                break;
            case 8:
                System.out.println("Your grade is AB");
                break;
            case 7:
                System.out.println("Your grade is BB");
                break;
            case 6:
                System.out.println("Your grade is BC");
                break;
            case 5:
                System.out.println("Your grade is CD");
                break;
            case 4:
                System.out.println("Your grade is DD");
                break;
            default :
                System.out.println("Your grade is AA");
                break;
            
        }
    }
    
}
