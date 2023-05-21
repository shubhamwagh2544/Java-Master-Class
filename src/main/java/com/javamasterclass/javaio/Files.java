package com.javamasterclass.javaio;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        //creating a file
        File file = createFile("src/main/java/com/javamasterclass/javaio/foo.txt");

        //writing to file
        writeToFile(file, true);

        //reading from file
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("foo");
            writer.println("bar");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path) throws IllegalStateException {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File Created Successfully");
            }
            return file;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
