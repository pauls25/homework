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

    private static final Set<String> cities = new HashSet<>();
    private static final Map<String, List<String>> destinations = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> fileContents = Files.readAllLines(path, charset).stream().toList();

        initializeDataStructures(fileContents);

        System.out.println("Here is a complete list of cities:");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a name of a city to start your trip from!");
        List<String> tripStops = new ArrayList<>();
        while (true) {
            String cityName = userInput.nextLine();
            if (!cities.contains(cityName)) {
                System.out.println(cityName + " isn't a valid city name! Input a valid city name");
            } else {
                tripStops.add(cityName);
                System.out.println("From " + cityName + " you can travel to: ");
                System.out.println(destinations.get(cityName));
                System.out.println("Enter your next stop: ");
                if (tripStops.size() > 1 && cityName.equals(tripStops.get(0))) {
                    break;
                }
            }
        }
        System.out.println("You've reached your starting point and have completed your trip!");
        System.out.println("You traveled across these cities: ");
        System.out.println(tripStops);

    }

    public static void initializeDataStructures(List<String> fileContents) {

        for (String s : fileContents) {
            cities.addAll(Arrays.asList(s.split(" -> ")));
        }
        // load map with empty arrays
        for (String city : cities) {
            destinations.put(city, new ArrayList<String>());
        }

        for (String s : fileContents) {

            String origin = s.split(" -> ")[0];
            String destination = s.split(" -> ")[1];

            destinations.get(origin).add(destination);

        }
//        System.out.println(destinations);
    }
}
