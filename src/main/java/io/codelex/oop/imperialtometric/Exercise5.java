package io.codelex.oop.imperialtometric;

public class Exercise5 {

    public static void main(String[] args) {
        MeasurementConverter mc = new MeasurementConverter();

        System.out.printf("100 meters are %s yards.\n", mc.convert(100, ConversionType.METERS_TO_YARDS));
        System.out.printf("100 yards are %s meters.\n", mc.convert(100, ConversionType.YARDS_TO_METERS));
        System.out.printf("100 centimeters are %s inches.\n", mc.convert(100, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.printf("100 inches are %s centimeters.\n", mc.convert(100, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.printf("100 kilometers are %s miles.\n", mc.convert(100, ConversionType.KILOMETERS_TO_MILES));
        System.out.printf("100 miles are %s kilometers.\n", mc.convert(100, ConversionType.MILES_TO_KILOMETERS));

    }
}
