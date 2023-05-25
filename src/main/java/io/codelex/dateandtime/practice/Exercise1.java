package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a date in 2023 in the format DD.MM.YYYY");
        String dateString1 = userInput.nextLine();

        System.out.println("Enter another date in 2023 the format DD.MM.YYYY");
        String dateString2 = userInput.nextLine();

        LocalDate localDate1 = LocalDate.parse(dateString1, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate localDate2 = LocalDate.parse(dateString2, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        long daysBetween = ChronoUnit.DAYS.between(localDate1, localDate2);
        int numberOfWorkDays = 0;
        for (int i = 0; i <= daysBetween; i++) {
            LocalDate l = localDate2.plus(i, ChronoUnit.DAYS);
            if (l.getDayOfWeek().getValue() != 6 && l.getDayOfWeek().getValue() != 7) {
                numberOfWorkDays++;
            }
        }

        System.out.println("An employ would work " + numberOfWorkDays * 8 + " hours given the assumptions.");
    }
}
