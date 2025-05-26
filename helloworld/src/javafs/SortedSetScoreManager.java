package javafs;

import java.util.*;

public class SortedSetScoreManager {
    public static void main(String[] args) {
        SortedSet<Integer> scores = new TreeSet<>();

        // Adding student scores
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(90);
        scores.add(100);
        scores.add(92);  // Duplicate, will be ignored

        System.out.println("All Scores (Sorted): " + scores);

        // Get the top score
        int topScore = scores.last();
        System.out.println("Top Score: " + topScore);

        // Get the lowest score
        int lowestScore = scores.first();
        System.out.println("Lowest Score: " + lowestScore);

        // Get scores less than 90 (students who need improvement)
        SortedSet<Integer> below90 = scores.headSet(90);
        System.out.println("Scores below 90: " + below90);

        // Get scores greater than or equal to 90 (excellent performers)
        SortedSet<Integer> aboveOr90 = scores.tailSet(90);
        System.out.println("Scores 90 and above: " + aboveOr90);

        // Get scores between 80 (inclusive) and 95 (exclusive)
        SortedSet<Integer> between80And95 = scores.subSet(80, 95);
        System.out.println("Scores between 80 and 95: " + between80And95);
    }
}