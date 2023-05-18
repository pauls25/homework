package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final int COUNT_OF_RATINGS = 2;
    private static final VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list inventory (as user)");

            int n = keyboard.nextInt();
            keyboard.nextLine();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    listInventory();
                default:
                    break;
            }
        }
    }

    private static void listInventory() {
        videoStore.listInventory();
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            Video video = new Video(movieName);
            videoStore.addToInventory(video);
            for (int j = 1; j <= COUNT_OF_RATINGS; j++) {
                System.out.println("Enter rating" + j);
                int rating = scanner.nextInt();
                scanner.nextLine();
                videoStore.takeUserRating(video, rating);
            }
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Which movie do you wish to rent?");
        System.out.println("We have: ");
        videoStore.listInventory();
        String movieName = scanner.nextLine();
        videoStore.checkoutVideo(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Which movie do you wish to return?");
        String movieName = scanner.nextLine();
        videoStore.returnVideo(movieName);
    }
}
