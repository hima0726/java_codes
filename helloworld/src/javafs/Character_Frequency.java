package javafs;

public class Character_Frequency {
    public static void main(String[] args) {
        String word = "natasa";
        char[] chars = word.toCharArray(); // Convert string to char array
        boolean[] visited = new boolean[chars.length]; // Track counted characters

        System.out.println("Character Frequencies:");

        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) { // Skip already counted characters
                int count = 1;

                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        visited[j] = true; // Mark as counted
                    }
                }

                System.out.println(chars[i] + " -> " + count);
            }
        }
    }
}