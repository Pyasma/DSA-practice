package Piyush.Assignment.ConditionalLoops.EasyQuestion;
import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int r = sc.nextInt();
        System.out.println(PermimeterCircle(r)); 
    }

    static double PermimeterCircle(int r){
        return (double)2*Math.PI*r;
    }
}
