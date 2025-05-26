package javafs;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "hima"; 
        String str2 = "mahi"; 
        		

        // Step 1: Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Are they anagrams? false");
            return;
        }

        // Step 2: Convert both to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 3: Loop through each character in str1
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            boolean found = false;

            // Step 4: Try to find char1 in str2
            for (int j = 0; j < str2.length(); j++) {
                if (char1 == str2.charAt(j)) {
                    // Remove character from str2
                    str2 = str2.substring(0, j) + str2.substring(j + 1);
                    found = true;
                    break;
                }
            }

            // Step 5: If character not found, not an anagram
            if (!found) {
                System.out.println("Are they anagrams? false");
                return;
            }
        }

        // Step 6: If all characters matched
        System.out.println("Are they anagrams? true");
    }
}