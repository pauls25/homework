package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        lineCount = lines.size();
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            List<String> wordsArray = new ArrayList<>(List.of(line.split(" ")));
            wordsArray.remove("");
            wordCount += wordsArray.size();
        }
        for (String line : lines) {
            charCount += line.toCharArray().length;
        }

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
