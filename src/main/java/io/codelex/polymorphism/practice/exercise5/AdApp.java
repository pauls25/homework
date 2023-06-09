package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class AdApp {
    public static void main(String[] arg) {
        Campaign c = new Campaign();
        c.addAdvert(new Advert(1000));
        c.addAdvert(new Hoarding(500, 7, 200));
        c.addAdvert(new NewspaperAd(0, 30, 20));
        c.addAdvert(new TVAd(50000, 1000, 30, true));
        c.addAdvert(new Poster(200, 10, BigDecimal.valueOf(20.0), 100, 200));
        System.out.println(c);
    }
}
