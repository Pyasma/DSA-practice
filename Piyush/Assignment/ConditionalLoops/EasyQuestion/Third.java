package Piyush.Assignment.ConditionalLoops.EasyQuestion;
import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l:");
        int l = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.println(AreaRectangle(l, b));
        
    }   

    static double AreaRectangle(int l, int b){
        return l*b;
    }
}
