package javafs;

public class Word_Frequency {
    public static void main(String[] args) {
        String str = "i have no issue for have an issue";

        // Step 1: Split the string into words
        String[] words = str.split(" "); // Splitting by space

        int wordCount = words.length;
        boolean[] counted = new boolean[wordCount]; // To track counted words

        System.out.println("Word Frequencies:");

        // Step 2: Count frequencies
        for (int i = 0; i < wordCount; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < wordCount; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(words[i] + " -> " + count);
            }
        }
    }
}