package javafs;

import java.io.*;

public class CheckException {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Bindhu.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}