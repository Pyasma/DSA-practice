package Piyush.String;

public class PrettyPrinting {
    public static void main(String[] args) {
        //Plus operators only works for primitive or when one of the values are string
        String ans = new Integer(58) + "" + new Double(4.5);
        System.out.println(ans);
        System.out.println("a" + "b"); 
    }
}
