package io.codelex.oop.imperialtometric;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType) {
        return value * conversionType.getCoefficient();
    }
}
