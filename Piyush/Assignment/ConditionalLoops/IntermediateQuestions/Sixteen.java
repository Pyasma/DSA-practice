package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Sixteen {
    public static void main(String[] args) {
        String s = "Hello";
        //System.out.println(Reverse(s));
        Reverse2(s);
        System.out.println(ReverseChar3(s));
    }

    static String Reverse(String s){
        String reversed = "";
        for (int i = s.length()-1;i >= 0; i--){
            reversed += s.charAt(i);
        }return reversed;
    }

    static void Reverse2(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
    }

    static String ReverseChar3(String s){
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }return new String(ch);
    }
}
