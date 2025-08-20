package Piyush.Assignment.Arrays.Easy;

public class Nineteen {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(bruteForceMaxpopulation(logs));
        System.out.println(maximumpopulation(logs));
    }
    static int maximumpopulation(int[][] logs){
        int baseyear = 1950;
        int[] popchanges = new int[101];
        for (int[] log : logs){
            popchanges[log[0] - baseyear] += 1;
            popchanges[log[1] - baseyear] -= 1;
        }
        // In this Case What we are doing is basically creating an array consiting of +1 or -1;
        int maxpopulation = 0, year = baseyear, currentpopulation = 0;
        for (int i = 0; i < popchanges.length; i++){
            currentpopulation += popchanges[i];
            if (currentpopulation > maxpopulation){
                maxpopulation = currentpopulation;
                year = baseyear+i;
            }

            // returning the max population by comparing it 
        }
        return year;
    }

    // Brute Force;

    static int bruteForceMaxpopulation(int[][] logs){
        int maxPopulation = 0;
        int year = 1950;

        for (int i = 1950; i <=2050; i++){
            int count = 0;
            for (int[] log : logs){
                if (log[0] <= i && i <log[1]){
                    count++;
                }
            }
            if (count > maxPopulation){
                maxPopulation = count;
                year = i;
            }
        }return year;
    }
}
