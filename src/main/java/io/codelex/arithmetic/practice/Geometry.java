package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal PI = new BigDecimal(Math.PI);
        BigDecimal result = radius
                .setScale(4, RoundingMode.HALF_UP)
                .pow(2)
                .multiply(PI);

        return result.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h)
                .divide(new BigDecimal(2), 2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
