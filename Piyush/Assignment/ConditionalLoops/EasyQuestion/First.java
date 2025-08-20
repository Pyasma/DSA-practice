package Piyush.Assignment.ConditionalLoops.EasyQuestion;
import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int r = sc.nextInt();
        System.out.println(AreaCircle(r)); 
    }

    static double AreaCircle(int r){
        return (double)(Math.PI)*(Math.pow(r,2));
    }
}
