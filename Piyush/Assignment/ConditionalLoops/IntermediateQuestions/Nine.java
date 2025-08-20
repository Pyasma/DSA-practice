package Piyush.Assignment.ConditionalLoops.IntermediateQuestions;

public class Nine {
    public static void main(String[] args) {
        int Hits = 30;
        int AtBats = 100;
        System.out.println(AverageBatting(AtBats, Hits));
    }
    
    static double AverageBatting(int AtBats, int Hits){
        return Hits/(double)AtBats;
    }
}
