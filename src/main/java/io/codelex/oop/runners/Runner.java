package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(1000, 361),
    INTERMEDIATE(360, 241),
    ADVANCED(240, 0);

    public double minimumTime;
    public double maximumTime;

    Runner(double minimumTime, double maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public static Runner getFitnessLevel(double runTimeInMinutes) {
        Runner fitnessLevel = null;
        if (runTimeInMinutes >= BEGINNER.maximumTime) {
            fitnessLevel = BEGINNER;
        } else if (runTimeInMinutes <= INTERMEDIATE.minimumTime && runTimeInMinutes >= INTERMEDIATE.maximumTime) {
            fitnessLevel = INTERMEDIATE;
        } else if (runTimeInMinutes <= ADVANCED.minimumTime && runTimeInMinutes >= ADVANCED.maximumTime) {
            fitnessLevel = ADVANCED;
        }
        return fitnessLevel;
    }
}
