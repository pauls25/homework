package io.codelex.classesandobjects.practice;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public String getRating() {
        return this.rating;
    }

    public ArrayList<Movie> getPG(ArrayList<Movie> movies) {
        ArrayList<Movie> PGMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                PGMovies.add(movie);
            }
        }
        return PGMovies;
    }
}
