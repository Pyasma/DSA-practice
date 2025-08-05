package Piyush.String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i= 0; i < 26; i++){
            char ch = (char)('a' + i);
            series += ch;
            series += " ";
        }System.out.printf("this is %s\n",series);
    }
}
