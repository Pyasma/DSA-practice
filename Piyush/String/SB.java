package Piyush.String;

public class SB {
    public static void main(String[] args) {
        // This is Mutable unlike String and also Time Complexity is O(N)
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
            series.append(" ");
        }
        System.out.printf("Formatted Print %s", series.toString());
    }
}
