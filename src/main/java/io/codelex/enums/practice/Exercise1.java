package io.codelex.enums.practice;

public class Exercise1 {
    public static CardinalPoints sides;

    public static void main(String[] args) {
        for (CardinalPoints side : CardinalPoints.values()) {
            System.out.println(side.getName() + ":" +
                    side.getDirection() + ":" +
                    side.getNumber()
            );
        }
    }

    private enum CardinalPoints {
        NORTH("North", "up", 0),
        SOUTH("South", "down", 1),
        EAST("East", "left", 2),
        WEST("West", "right", 3);

        CardinalPoints(String name, String direction, int number) {
            this.name = name;
            this.direction = direction;
            this.number = number;
        }

        private final String name;

        private final String direction;
        private final int number;

        @Override
        public String toString() {
            return "CardinalPoints{" +
                    "direction='" + direction + '\'' +
                    ", number=" + number +
                    '}';
        }

        public String getName() {
            return name;
        }

        public String getDirection() {
            return direction;
        }

        public int getNumber() {
            return number;
        }
    }
}
