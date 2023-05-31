package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> fileContents = Files.readAllLines(path, charset).stream().toList();

        Set<String> cities = new HashSet<>();
        Map<String, List<String>> destinations = new HashMap<>();
        for (String s : fileContents) {
            cities.addAll(Arrays.asList(s.split(" -> ")));
        }
        // load map with empty arrays
        for (String city : cities) {
            destinations.put(city, new ArrayList<String>());
        }
        System.out.println(destinations);

        for (String s : fileContents) {

            for (String city : s.split(" -> ")) {
                String origin = s.split(" -> ")[0];
                String destination = s.split(" -> ")[1];

//                if (destinations.containsKey(origin)) {
                destinations.get(origin).add(destination);
//                } else {
//                destinations.put(origin);
//                }
            }
        }
        System.out.println(destinations);
    }
}
