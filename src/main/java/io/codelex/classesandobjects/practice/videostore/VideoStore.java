package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    private final ArrayList<Video> inventory = new ArrayList<Video>();

    public VideoStore() {
    }

    public void addToInventory(Video vid) {
        inventory.add(vid);
    }

    public ArrayList<Video> getInventory() {
        return inventory;
    }

    public void checkoutVideo(String videoName) {
        for (Video video : getInventory()) {
            if (video.getTitle().equals(videoName)) {
                video.checkOutVideo();
            }
        }
    }

    public void returnVideo(String videoName) {
        for (Video video : getInventory()) {
            if (video.getTitle().equals(videoName)) {
                video.returnVideo();
            }
        }
    }

    public void takeUserRating(Video video, int rating) {
        video.setUserRating(rating);
    }

    public void listInventory() {
        for (Video vid : this.inventory) {
            System.out.println(vid.toString());
        }
    }
}
