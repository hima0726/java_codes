package javafs;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "swiss";
        boolean isUnique;

        for (int i = 0; i < str.length(); i++) {
            isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}