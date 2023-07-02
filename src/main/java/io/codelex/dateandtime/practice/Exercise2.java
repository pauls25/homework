package io.codelex.dateandtime.practice;

import java.sql.Array;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter server launch date in the format DD.MM.YYYY");
        String dateString1 = userInput.nextLine();

        LocalDate serverLaunchDate = LocalDate.parse(dateString1, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Now enter date information for the update schedule!");
        System.out.println("Enter the year: ");
        int year = userInput.nextInt();

        System.out.println("Enter the full name of the month: ");
        userInput.nextLine();
        
        String month = userInput.nextLine();

        LocalDate reportPeriodStart = LocalDate.of(year, parseMonthString(month), 1);
        LocalDate reportPeriodEnd = reportPeriodStart.plusMonths(1);

        System.out.printf("For %s, %d the server update are:\n", month, year);
        for (LocalDate date = serverLaunchDate; date.isBefore(reportPeriodEnd); date = date.plusDays(14)) {
            if (date.isEqual(reportPeriodStart) || date.isAfter(reportPeriodStart)) {
                System.out.println(date);
            }
        }
    }

    public static int parseMonthString(String month) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        String m = month.toLowerCase();

        List<String> mList = Arrays.asList(months);
        int index = mList.indexOf(m) + 1;
        return index;
    }
}
