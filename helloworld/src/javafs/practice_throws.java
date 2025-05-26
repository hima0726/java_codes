package javafs;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class practice_throws {

    // This method may throw FileNotFoundException and IOException
    public static void readFile() throws FileNotFoundException, IOException {
        // FileNotFoundException is a subclass of IOException, but shown here for clarity
        FileReader file = new FileReader("arun.txt"); // Might throw FileNotFoundException
        BufferedReader reader = new BufferedReader(file); // Might throw IOException

        // Reading a line (can throw IOException)
        String line = reader.readLine();

        System.out.println("Read line: " + line);

        reader.close(); // Can also throw IOException
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}