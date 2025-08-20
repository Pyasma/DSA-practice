package Piyush.Assignment.ConditionalLoops.EasyQuestion;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.println(AreaTriangle(h, b));
    }
    
    static double AreaTriangle(int h, int b){
        return (h*b*(0.5));
    }
}
