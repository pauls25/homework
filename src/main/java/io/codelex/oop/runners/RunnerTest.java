package io.codelex.oop.runners;

public class RunnerTest {
    public static void main(String[] args) {

        double runTime1 = 400;
        double runTime2 = 300;
        double runTime3 = 200;

        Runner level1 = Runner.getFitnessLevel(runTime1);
        Runner level2 = Runner.getFitnessLevel(runTime2);
        Runner level3 = Runner.getFitnessLevel(runTime3);

        System.out.println("a marathon run time of " + runTime1 + " minutes corresponds to " + level1);
        System.out.println("a marathon run time of " + runTime2 + " minutes corresponds to " + level2);
        System.out.println("a marathon run time of " + runTime3 + " minutes corresponds to " + level3);
    }
}
