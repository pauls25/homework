package io.codelex.javaadvancedtest.exercise4;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReverser {
    public static void main(String[] args) {
        Path currentPath = Paths.get("");
        String absolutePath = currentPath.toAbsolutePath().toString();
        String middlePaths = "\\src\\main\\java\\io\\codelex\\javaadvancedtest\\exercise4\\";
        String filePath = "examplefile.md";
        try {
            File file = new File(absolutePath + "\\" + middlePaths + filePath);
            String directory = file.getParent();
            String fileName = file.getName().replace(".md", "");

            System.out.println(fileName);
            String reversedContent = reverseFileContent(file);
            String reversedTitle = reverseString(fileName);

            String newFilePath = directory + "/" + reversedTitle + ".md";
            saveToFile(newFilePath, reversedContent);

            System.out.println("File saved with reversed content and title.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static String reverseFileContent(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
        }
        String content = contentBuilder.toString();
        return reverseString(content);
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static void saveToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}
