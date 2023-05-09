package io.codelex.typesandvariables.practice;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner((System.in));
        int NUMBER_OF_SUBJECTS = 8;

        List<String> subjectList = new ArrayList<String>(NUMBER_OF_SUBJECTS);
        List<String>  teacherList = new ArrayList<String>(NUMBER_OF_SUBJECTS);

        // collect user input and add it to lists
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            System.out.printf("Enter subject number %d: %n",i+1);
            String subjectName = userInput.nextLine();
            subjectList.add(subjectName);
            System.out.printf("Enter teacher number %d: %n",i+1);
            String teacherName = userInput.nextLine();
            teacherList.add(teacherName);
        }

        // print data to table
        System.out.println("+------------------------------------------------------------+");
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {

            String subject = subjectList.get(i);
            int spaceLength = subject.length();

            String teacher = teacherList.get(i);
            int teacherLength = teacher.length();

            System.out.print("| " + (i + 1) + " |");
            System.out.print("| " + (" ".repeat(26 - spaceLength) + subject) + " |");
            System.out.println("| " + (" ".repeat(15 - teacherLength) + teacher) + " |");

        }
        System.out.println("+------------------------------------------------------------+");
//                "| 1 |                          English III |       Ms. Lapan |\n" +
//                "| 2 |                          Precalculus |     Mrs. Gideon |\n" +
//                "| 3 |                         Music Theory |       Mr. Davis |\n" +
//                "| 4 |                        Biotechnology |      Ms. Palmer |\n" +
//                "| 5 |           Principles of Technology I |      Ms. Garcia |\n" +
//                "| 6 |                             Latin II |    Mrs. Barnett |\n" +
//                "| 7 |                        AP US History | Ms. Johannessen |\n" +
//                "| 8 | Business Computer Infomation Systems |       Mr. James |\n" +
    }
}
