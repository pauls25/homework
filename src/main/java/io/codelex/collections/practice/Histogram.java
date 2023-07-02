package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";
    private static final Map<String, Integer> scoreCounts = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        initialiseScoreGroupings();
        groupScores(scores);
        printScores();
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void initialiseScoreGroupings() {

        scoreCounts.put("00-09", 0);
        scoreCounts.put("10-19", 0);
        scoreCounts.put("20-29", 0);
        scoreCounts.put("30-39", 0);
        scoreCounts.put("40-49", 0);
        scoreCounts.put("50-59", 0);
        scoreCounts.put("60-69", 0);
        scoreCounts.put("70-79", 0);
        scoreCounts.put("80-89", 0);
        scoreCounts.put("90-99", 0);
        scoreCounts.put("100", 0);
    }

    private static void groupScores(String scores) {

        int[] scoreArray = Arrays.stream(scores.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int score : scoreArray) {
            if (score <= 9) {
                incrementScoreCount("00-09");
            } else if (score > 9 && score <= 19) {
                incrementScoreCount("10-19");
            } else if (score > 19 && score <= 29) {
                incrementScoreCount("20-29");
            } else if (score > 29 && score <= 39) {
                incrementScoreCount("30-39");
            } else if (score > 39 && score <= 49) {
                incrementScoreCount("40-49");
            } else if (score > 49 && score <= 59) {
                incrementScoreCount("50-59");
            } else if (score > 59 && score <= 69) {
                incrementScoreCount("60-69");
            } else if (score > 69 && score <= 79) {
                incrementScoreCount("70-79");
            } else if (score > 79 && score <= 89) {
                incrementScoreCount("80-89");
            } else if (score > 89 && score <= 99) {
                incrementScoreCount("90-99");
            } else if (score == 100) {
                incrementScoreCount("100");
            }
        }
    }

    private static void incrementScoreCount(String key) {
        int currentCount = scoreCounts.get(key);
        scoreCounts.put(key, currentCount + 1);
    }

    private static void printScores() {

        System.out.println("00-09: " + "*".repeat(scoreCounts.get("00-09")));
        System.out.println("10-19: " + "*".repeat(scoreCounts.get("10-19")));
        System.out.println("20-29: " + "*".repeat(scoreCounts.get("20-29")));
        System.out.println("30-39: " + "*".repeat(scoreCounts.get("30-39")));
        System.out.println("40-49: " + "*".repeat(scoreCounts.get("40-49")));
        System.out.println("50-59: " + "*".repeat(scoreCounts.get("50-59")));
        System.out.println("60-69: " + "*".repeat(scoreCounts.get("60-69")));
        System.out.println("70-79: " + "*".repeat(scoreCounts.get("70-79")));
        System.out.println("80-89: " + "*".repeat(scoreCounts.get("80-89")));
        System.out.println("90-99: " + "*".repeat(scoreCounts.get("90-99")));
        System.out.println("  100: " + "*".repeat(scoreCounts.get("100")));

    }
}
