package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class Video {
    private final String title;
    private boolean isCheckedOut;
    private final ArrayList<Integer> userRating = new ArrayList<>();
    private double averageRating;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOutVideo() {
        isCheckedOut = true;
    }

    public void returnVideo() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", userRating=" + userRating +
                ", averate user rating=" + averageRating +
                '}';
    }

    public ArrayList<Integer> getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating.add(userRating);
        calculateAverageRating();
    }

    public void calculateAverageRating() {
        int sum = 0;
        for (int i :
                this.userRating) {
            sum += i;
        }
        this.averageRating = (double) sum / this.userRating.size();
    }
}
